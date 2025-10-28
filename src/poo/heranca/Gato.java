package poo.heranca;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " miou: Miau!");
    }
}
