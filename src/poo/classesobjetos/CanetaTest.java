package poo.classesobjetos;

public class CanetaTest {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.carga = 50;
        c1.modelo = "Caneta bic cristal";

        c1.escrever();
    }
}
