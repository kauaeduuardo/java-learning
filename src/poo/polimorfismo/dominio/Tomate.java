package poo.polimorfismo.dominio;

public class Tomate extends Produto implements Tributavel {
    private static final double IMPOSTO_TOMATE = 0.05;
    private String dataValidade;

    public Tomate(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public double calcularImposto() {
        return this.preco * IMPOSTO_TOMATE;
    }
}
