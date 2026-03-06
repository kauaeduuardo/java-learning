package throwable.exceptioncustomizada;

public class ContaBancariaTest01 {
    static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.depositar(1000);
        System.out.println(contaBancaria.saldo);

        try {
            contaBancaria.sacar(100);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Dentro do finally.");
            System.out.println(contaBancaria.saldo);
        }
    }
}
