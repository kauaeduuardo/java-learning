package poo.encapsulamento;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valorSaque) {
        this.saldo -= valorSaque;
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

}
