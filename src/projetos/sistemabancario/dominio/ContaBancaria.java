package projetos.sistemabancario.dominio;

public class ContaBancaria {
    private String nomeDotitular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.nomeDotitular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Seu saldo é de apenas R$" + this.saldo);
        } else {
            this.saldo = this.saldo - valor;
        }
    }

    public void exibirSaldo() {
        System.out.println("\n---------------------------");
        System.out.println("Nome do titular: " + this.nomeDotitular);
        System.out.println("Saldo atual: R$" + this.saldo);
        System.out.println("---------------------------\n");
    }

    public String getNomeDotitular() {
        return nomeDotitular;
    }

    public double getSaldo() {
        return saldo;
    }
}
