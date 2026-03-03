### 🔢 Enumeração

#### Conceito
* **Enumeração (enum):** é um tipo especial de classe usado para representar um conjunto fixo e finito de valores válidos.
* Cada valor do enum é uma instância única, criada e controlada pela própria linguagem.

Enums existem para modelar conceitos do domínio, não para *substituir String*.

#### Analogia
> Um enum é como um cardápio fechado.  
Você só pode escolher entre as opções que já existem — não pode inventar um prato novo em tempo de execução.

#### Exemplo
~~~java
public enum TipoCliente {
    PESSOA_FISICA,
    PESSOA_JURIDICA
}

public class Cliente {
    private String nome;
    private TipoCliente tipo;
}

~~~ 
👉 **O que acontece:** TipoCliente restringe os valores possíveis.
Cliente tem um tipo válido garantido em tempo de compilação.


#### Enum com atributos e comportamento
Enums não são apenas constantes: podem ter estado e lógica própria.

~~~java
public enum TipoPagamento {

    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.10;
        }
    },

    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);
}
~~~ 

👉 **O que acontece:** O comportamento varia conforme o valor do `enum`, sem `if` ou `switch`.
A decisão ocorre em tempo de execução, mas o modelo continua fechado e seguro.
