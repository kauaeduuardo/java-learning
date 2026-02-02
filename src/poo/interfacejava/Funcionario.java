package poo.interfacejava;

public class Funcionario implements Pagavel {
    private String nome;
    private double salarioBase;
    private double bonus;

    public Funcionario(String nome, double salarioBase, double bonus) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    @Override
    public double calcularPagamento() {
        return salarioBase + bonus;
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + " | Pagamento: R$ " + calcularPagamento();
    }
}
