package poo.interfacejava;

public class Produto implements Pagavel {
    private String descricao;
    private double preco;
    private int quantidade;

    public Produto(String descricao, double preco, int quantidade) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public double calcularPagamento() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + descricao + " | Total: R$ " + calcularPagamento();
    }
}
