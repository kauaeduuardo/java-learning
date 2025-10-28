### 🌀 4. Polimorfismo

#### Conceito
Polimorfismo significa **“muitas formas”**. \
Em Java, permite que um mesmo método se comporte de formas diferentes dependendo do tipo do objeto que o executa.

#### Analogia
> O comando `fazerSom()` é o mesmo, mas um cachorro late e um gato mia.

#### Exemplo
~~~java
Animal a1 = new Cachorro();
Animal a2 = new Gato();

a1.emitirSom(); // Au au!
a2.emitirSom(); // Miau!
~~~ 
👉 **O que acontece:** o método `emitirSom()` é chamado da mesma forma, mas o comportamento depende da classe concreta.