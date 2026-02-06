### 🧩 Interfaces

#### Conceito
Interface: define um contrato.
- Ela diz o que uma classe deve fazer, mas não como (na regra geral).
- Não possui estado mutável.
- Não pode ser instanciada.
- Força consistência entre classes sem acoplamento por herança.

Uma interface existe para padronizar comportamento, não para reutilizar código.

#### Analogia
> Uma interface é como um padrão de tomada.  
Você não liga nada na tomada em si — ela só define como os aparelhos devem se conectar.

#### Exemplo
~~~java
public interface DataLoader {
    void load();
}

public class DataBaseLoader implements DataLoader {

    @Override
    public void load() {
        // lógica de carregamento do banco
    }
}
~~~ 

👉 **O que acontece:**  
`DataLoader` define o contrato.  
`DataBaseLoader` assume a responsabilidade de cumprir esse contrato.

Se amanhã existir `FileLoader`, `ApiLoader` ou `CacheLoader`, todos podem ser tratados como `DataLoader`.

---
**Métodos default**

Interfaces podem conter métodos com implementação, usando `default`.
~~~java
public interface DataLoader {
    void load();

    default void checkPermission() {
        System.out.println("Permissão checada!");
    }
}
~~~ 
👉 **Impacto real:**
- Todas as classes que implementam a interface ganham esse método automaticamente.
  O método pode ser sobrescrito.
- Serve para evoluir interfaces sem quebrar código antigo.

`Default` não transforma interface em herança.
Ele existe por necessidade de compatibilidade, não como prática principal de design.

**Atributos em Interfaces**

Todos os atributos em interfaces são constantes:

~~~java
public interface Config {
    int MAX = 10; // public static final implícito
}
~~~

👉 **Não existe:**
- atributo de instância
- estado mutável
- construtor

Interface não guarda dados, só regras.


**Métodos Estáticos**

Interfaces podem ter métodos static:

~~~java
public interface Utils {
    static void log(String msg) {
        System.out.println(msg);
    }
}
~~~


📌 Observação importante:
- Métodos estáticos não são sobrescritos.
- Eles pertencem à interface, não à classe que implementa.


**Interfaces herdando interfaces**

Interfaces podem estender outras interfaces:

~~~java
public interface AdvancedLoader extends DataLoader {
    void validate();
}
~~~

👉 Uma classe que implementa `AdvancedLoader` é obrigada a implementar todos os métodos da hierarquia.

---

**Regras Importantes**

- Uma classe pode implementar várias interfaces. Porém, só pode herdar de uma única classe.
- Interfaces não podem ser instanciadas.
- Uma implementação não pode reduzir o nível de acesso dos métodos:
    - private → default → protected → public

Se a interface define um método como `public`, a implementação não pode ser mais restritiva.