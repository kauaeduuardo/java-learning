### 🚨 Exceções

#### Conceito
Exceções representam situações anormais que interrompem o fluxo esperado de execução do código.
- Todas herdam da classe `Throwable`.
- Podem ser tratadas (checked) ou opcionais de tratar (unchecked).
- Quando não tratadas, propagam-se até encerrar o programa.

Uma exceção existe para sinalizar que algo saiu do fluxo normal — não para controlar lógica de negócio.

#### Hierarquia

```
Throwable
├── Error                         → falhas graves, sem recuperação
└── Exception
    ├── RuntimeException          → unchecked (erros de lógica/programação)
    └── (filhas diretas)          → checked (exigem tratamento obrigatório)
```

**Error**
Representa falhas graves do ambiente de execução, sem possibilidade de recuperação pelo programa.
Exemplo clássico: `StackOverflowError`, que ocorre quando chamadas recursivas esgotam o espaço disponível na pilha.

**RuntimeException — Unchecked**
Lançadas durante a execução e indicam falhas de lógica ou erros de programação. Não exigem tratamento obrigatório pelo compilador, mas podem ser tratadas se necessário.

**Exception — Checked**
Filhas diretas de `Exception`. Exigem tratamento obrigatório em tempo de compilação — todo método que lança (ou chama algo que lança) uma checked exception deve tratar com `try/catch` ou repassar com `throws`.

---

#### Estrutura try/catch

```java
try {
    // Bloco com código que pode lançar a exceção
    // O método chamado deve declarar que pode lançá-la (throws)
} catch (IOException e) {
    // Executado apenas se uma exceção for lançada
    // Prefira capturar a exceção mais específica, nunca apenas Exception
    // Não coloque regras de negócio aqui
}
```

👉 **Importante:** após a linha que lança a exceção, as demais linhas do bloco `try` são ignoradas.

---

#### Propagação da Exceção

Se uma exceção não for tratada, ela é propagada para o método chamador, subindo a cadeia até o `main`. Se não houver tratamento em nenhum nível, a execução é encerrada.

```
main → metodoA → metodoB
```

`metodoB` lança uma exceção → se `metodoA` não tratar → chega ao `main` → se `main` não tratar → fim da execução.

---

#### `throw` vs `throws`

| | Uso |
|---|---|
| `throw` | Lança a exceção para o chamador |
| `throws` | Declara na assinatura do método que ele pode lançar uma exceção |

`throw` lança. `throws` avisa. São conceitos distintos e complementares.

```java
public void sacar(double valor) throws RuntimeException {
    if (valor <= 0) {
        throw new RuntimeException("O valor do saque deve ser positivo.");
    }
    System.out.println("Saque de R$" + valor + " realizado.");
}
```

Tratando (opcionalmente) no chamador:

```java
public static void main(String[] args) {
    Conta conta = new Conta();

    try {
        conta.sacar(-100);
    } catch (RuntimeException e) {
        System.out.println("Erro: " + e.getMessage());
    }

    System.out.println("Execução continua...");
}
```

---

#### Checked Exceptions — Propagando sem tratar

```java
public class ExceptionTest02 {

    public static void main(String[] args) throws IOException {
        lerArquivo("dados.txt");
        System.out.println("Fim da execução."); // nunca executado se a exceção for lançada
    }

    public static void lerArquivo(String caminho) throws IOException {
        File arquivo = new File(caminho);
        FileReader leitor = new FileReader(arquivo); // lança FileNotFoundException
        System.out.println("Arquivo aberto com sucesso!");
        leitor.close();
    }
}
```

👉 **Fluxo de propagação:**
```
FileReader  →  lança FileNotFoundException
lerArquivo  →  não trata, repassa com throws IOException
main        →  não trata, repassa com throws IOException
JVM         →  ninguém tratou, programa encerra
```

`FileNotFoundException` é filha de `IOException`, que é filha direta de `Exception` — por isso é uma checked exception e exige tratamento ou repasse em toda a cadeia.

**Resumo de responsabilidade:**

| Situação | Ação |
|---|---|
| Consigo tratar o erro aqui | `try/catch` |
| Não é minha responsabilidade tratar | `throws` — repasso ao chamador |
| Ninguém trata | Programa encerra com erro |

---

#### Bloco Finally

Executado independentemente do que acontece no `try/catch` — com ou sem exceção. Geralmente utilizado para fechar recursos que foram abertos anteriormente.

```java
try {
    // código que pode lançar exceção
} catch (IOException e) {
    // tratamento do erro
} finally {
    // sempre executado
    recurso.close();
}
```

---

#### Múltiplos Catchs

É possível capturar múltiplas exceções com múltiplos blocos `catch` — sejam `RuntimeException` ou checked.

⚠️ **Regra:** não coloque um tipo mais genérico antes do mais específico. O catch mais genérico deve vir por último.

```java
try {
    // ...
} catch (IllegalArgumentException e) {
    // capturado primeiro por ser mais específico
} catch (RuntimeException e) {
    // captura qualquer outra RuntimeException
}
```

Se `RuntimeException` viesse primeiro, `IllegalArgumentException` nunca seria alcançado — toda exceção filha de `RuntimeException` já seria capturada pelo bloco anterior.

**Multi-catch em linha**

Uma sintaxe alternativa e mais limpa para múltiplos catchs.  
**A regra:** exceções sem relação de herança entre si podem ser agrupadas no mesmo `catch`, separadas por `|`.

```java
try {
    // ...
} catch (SQLException | ArithmeticException e) {
    // trata ambas
}
```

📌 Se uma for filha (ou ancestral) da outra, o compilador acusa erro por redundância.

---

#### Exceção Customizada

Crie uma classe e estenda `RuntimeException` (unchecked) ou `Exception` (checked):

```java
public class MinhaException extends Exception {

    public MinhaException() {
        super("Mensagem de erro padrão.");
    }

    public MinhaException(String msgErro) {
        super(msgErro);
    }
}
```

---

#### Regras para Sobrescrita de Métodos

Métodos que sobrescrevem outro têm restrições sobre as exceções que podem declarar:

1. Pode lançar as mesmas exceções, exceções mais específicas (filhas), ou nenhuma exceção.
2. **Não pode** lançar exceções mais genéricas (ancestrais), nem checked exceptions que não estavam declaradas no método original.