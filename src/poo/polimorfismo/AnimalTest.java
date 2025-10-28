package poo.polimorfismo;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animais = new Animal[5];

        for (int i = 0; i < animais.length; i++) {
            if (i % 2 == 0) {
                animais[i] = new Cachorro("cachorro");
            } else {
                animais[i] = new Gato("gato");
            }
        }

        for (Animal a : animais) {
            a.emitirSom();
        }

    }
}
