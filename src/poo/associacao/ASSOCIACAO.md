### 🔗 Associação entre Objetos

#### Conceito
* **Associação:** ocorre quando uma classe possui uma referência a outra, indicando um relacionamento do tipo “tem um”.
* Não envolve `herança` ou compartilhamento de identidade.


#### Analogia
> Uma pessoa tem um endereço.  
Ela não é um endereço — logo, não faz sentido herdar.

#### Exemplo
~~~java
public class Endereco {
    String rua;
    String cidade;
}

public class Pessoa {
    String nome;
    Endereco endereco;
}
~~~

👉 **O que acontece:**
`Pessoa` conhece e utiliza `Endereco`.
Cada classe mantém sua própria responsabilidade.
