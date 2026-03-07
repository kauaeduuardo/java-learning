package projetos.sistemabancario.dominio;

public class ContaBancaria {
    private static final double LIMITE_DE_SAQUE_DIARIO = 5000;
    private double valorEmSaquesDiarios;

    private String nomeDotitular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.nomeDotitular = titular;
        this.saldo = 0.0;
        this.valorEmSaquesDiarios = 0;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor) {
        if (isSaldoSuficiente(valor)) {
            if (isDentroDoLimite()) {
                this.saldo = this.saldo - valor;
            }
        } else {
            System.out.println("Erro: Saldo insuficiente ou limite atingido.");
        }
    }

    public boolean isSaldoSuficiente(double valor) {
        return this.saldo >= valor;
    }

    public boolean isDentroDoLimite() {
        return this.valorEmSaquesDiarios < LIMITE_DE_SAQUE_DIARIO;
    }

    public void transferencia(ContaBancaria destinatario, double valor) {
        if (isSaldoSuficiente(valor)) {
            if(isDentroDoLimite()) {
                sacar(valor);
                destinatario.depositar(valor);
            }
        } else {
            System.out.println("Erro: Saldo insuficiente ou limite atingido.");
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
