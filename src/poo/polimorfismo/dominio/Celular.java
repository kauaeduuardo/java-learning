package poo.polimorfismo.dominio;

public class Celular extends Produto implements Tributavel{
    private static final double IMPOSTO_CELULAR = 0.30;

    public Celular(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return this.preco * IMPOSTO_CELULAR;
    }
}
