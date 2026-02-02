### 🧬 Herança

#### Conceito
Herança é o mecanismo que permite que uma classe **filha** herde atributos e métodos de uma classe **mãe**.
Serve para **reaproveitar código** e criar **especializações**. 

#### Analogia
> Um “Cachorro” herda características de “Animal”, mas tem comportamentos próprios.

#### Exemplo
~~~java
public class Animal {
    void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}

public class Cachorro extends Animal {
    void emitirSom() {
        System.out.println("Au au!");
    }
}
~~~ 
👉 **O que acontece:** `Cachorro` é uma especialização de `Animal`. Ele herda comportamentos, mas pode sobrescrevê-los.