package poo.heranca;

public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void emitirSom() {
        System.out.println(nome + " fez um som genérico.");
    }
}
