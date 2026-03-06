package throwable.exceptioncustomizada;

public class ContaBancaria {
    int numeroConta = 0;
    double saldo = 0;

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException();
        }
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
}
