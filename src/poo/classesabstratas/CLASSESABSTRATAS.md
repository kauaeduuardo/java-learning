### 🧩 Classes Abstratas

#### Conceito
* **Classe abstrata:** é um template que define estado e/ou comportamento comum, mas não pode ser instanciada.
* Serve como base para outras classes mais específicas.

Ela existe para forçar estrutura, não para ser usada diretamente.

#### Analogia
> Uma classe abstrata é como um contrato de trabalho genérico.  
Ninguém “é” um contrato — ele só faz sentido quando alguém o assume.

#### Exemplo
~~~java
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public abstract void aplicarAumento(double valor);
}

public class Programador extends Funcionario {

    @Override
    public void aplicarAumento(double valor) {
        salario += valor;
    }
}

~~~ 

👉 **O que acontece:**  
`Funcionario` define o que deve existir.  
`Programador` decide como isso funciona.

📌 **Ponto crítico:**
Uma classe concreta é obrigada a implementar todos os métodos abstratos herdados.