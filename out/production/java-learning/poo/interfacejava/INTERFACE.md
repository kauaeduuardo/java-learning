### 🔌 5. Interface

#### Conceito
Uma **interface** define um **contrato:** um conjunto de métodos que uma classe deve obrigatoriamente implementar. \
Ela **não tem implementação**, apenas a definição das ações esperadas

#### Analogia
> Uma tomada tem um formato padrão. Qualquer aparelho que quiser se conectar deve respeitar esse formato (contrato).

#### Exemplo
~~~java
public interface Pagavel {
    double calcularPagamento();
}

public class Funcionario implements Pagavel {
    public double calcularPagamento() {
        return 2000.0;
    }
}

public class Produto implements Pagavel {
    public double calcularPagamento() {
        return 500.0;
    }
}
~~~ 
👉 **O que acontece:** tanto `Funcionario` quanto `Produto` respeitam o contrato `Pagavel`, mas com implementações diferentes.