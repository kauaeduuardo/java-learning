package poo.encapsulamento;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        /*
            sem encapsulamento: instancia --> atributo
            com encapsulamento: instancia --> metodo acessor ou modificador --> atributos
         */

        // não altero os atributos diretamente
        conta.setNumeroDaConta(123);
        conta.setSaldo(1000.00);

        // não acesso os atributos diretamente
        System.out.println("Número da conta: " + conta.getNumeroDaConta());
        System.out.println("Saldo inicial: " + conta.getSaldo());

        conta.sacar(200.00);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
