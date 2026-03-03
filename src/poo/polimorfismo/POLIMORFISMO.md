### 🔀 Polimorfismo

#### Conceito
Polimorfismo: muitas formas para um mesmo tipo.
- Uma variável de referência do tipo "pai" pode apontar para qualquer subclasse.
- A subclasse é uma forma mais específica do pai.
- Permite tratar objetos diferentes de maneira uniforme.

Polimorfismo existe para flexibilizar o código, não para confundir hierarquias.

#### Analogia
> Produto é genérico — Arroz é específico.  
"Produto? Que produto? Arroz é um produto."  
No polimorfismo, você fala com o genérico, mas age com o específico.

#### Exemplo
~~~java
public class Produto {
    private String nome;
    private double valor;
}

public class Arroz extends Produto {
    // herda nome e valor de Produto
}
~~~

~~~java
public static void main(String[] args) {
    Produto p = new Arroz(); // variável de referência do tipo Produto
}
~~~

👉 **O que acontece:**  
`p` é do tipo `Produto`, mas aponta para um objeto `Arroz`.  
A herança garante que tudo que `Arroz` herdou de `Produto` pode ser acessado por `p`.

Se amanhã existir `Feijão`, `Macarrão` ou `Sal`, todos podem ser tratados como `Produto`.

---

**Limitação da variável de referência**

A variável de referência enxerga apenas o que está definido na superclasse.

📌 Observação importante:
- Um atributo ou método novo na subclasse **não pode ser visto** pela variável de referência do tipo pai.
- Para acessar o que é exclusivo da subclasse, é necessário usar **cast**.

~~~java
Arroz arroz = (Arroz) p; // cast: de Produto para Arroz
~~~

👉 O cast é uma relação de filho para pai — você está dizendo explicitamente: "eu sei que esse `Produto` é um `Arroz`."

---

**instanceof**

Antes de fazer um cast, é recomendado verificar se a variável de referência realmente aponta para aquela subclasse:

~~~java
public static void main(String[] args) {
    Produto p = new Arroz();

    if (p instanceof Arroz) {
        System.out.println("Esse produto é um arroz");
    }
}
~~~

👉 **Por que isso importa:**  
Fazer um cast sem verificar pode lançar uma `ClassCastException` em tempo de execução.  
O `instanceof` é a forma segura de confirmar o tipo real do objeto antes de agir.

---

**Programação Orientada a Interface**

Uma interface também pode ser usada como variável de referência para o polimorfismo.

Se uma classe implementa uma interface, uma variável do tipo da interface pode assumir diferentes formas — assim como acontece com herança.

~~~java
public interface DataLoader {
    void load();
}

public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        // carrega do banco
    }
}

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        // carrega do arquivo
    }
}
~~~

~~~java
public static void main(String[] args) {
    DataLoader loader = new DatabaseLoader(); // interface como tipo de referência
    loader.load();

    loader = new FileLoader(); // mesma variável, nova forma
    loader.load();
}
~~~

👉 **A interface como tipo mais genérico:**  
`DataLoader` não sabe como cada classe carrega dados — só garante que todas vão carregar.  
O polimorfismo cuida do resto.

---

**Regras Importantes**

- A variável de referência pode ser do tipo da superclasse ou de uma interface implementada.
- Atributos e métodos exclusivos da subclasse só são acessíveis após cast.
- Sempre use `instanceof` antes de realizar um cast para evitar erros em tempo de execução.
- Uma mesma variável de referência pode apontar para diferentes objetos ao longo do tempo.