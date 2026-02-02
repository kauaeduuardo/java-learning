### ⚙️ 1. Classes e Objetos

#### Conceito
* **Classe:** é o *molde* ou *modelo* que define como um objeto será.
* **Objeto:** é uma *instância* dessa classe — algo concreto criado a partir do molde.

#### Analogia
> Uma classe é a planta de uma casa. \
O objeto é a casa construída a partir dessa planta.

#### Exemplo
~~~java
public class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Kauã";
        p1.idade = 20;
        p1.apresentar();
    }
}
~~~ 

👉 **O que acontece:** `Pessoa` é o molde, `p1` é o objeto criado a partir dele.