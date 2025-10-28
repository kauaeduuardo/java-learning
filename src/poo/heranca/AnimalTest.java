package poo.heranca;

public class AnimalTest {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Bilu");

        gato.comer();
        gato.emitirSom();

        cachorro.comer();
        cachorro.emitirSom();
    }
}
