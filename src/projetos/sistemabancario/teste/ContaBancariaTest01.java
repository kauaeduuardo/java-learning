package projetos.sistemabancario.teste;

import projetos.sistemabancario.dominio.ContaBancaria;

import java.util.Scanner;

public class ContaBancariaTest01 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int opcao;
        double saldoControle;

        System.out.print("Nome do dono: ");
        nome = scan.nextLine();

        ContaBancaria contaBancaria = new ContaBancaria(nome);

        while (true) {
            exibirMenuOpcoes();
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    contaBancaria.exibirSaldo();
                    break;
                case 2:
                    System.out.print("Valor do saque: ");
                    saldoControle = scan.nextDouble();
                    contaBancaria.sacar(saldoControle);
                    break;
                case 3:
                    System.out.print("Valor depósito: ");
                    saldoControle = scan.nextDouble();
                    contaBancaria.depositar(saldoControle);
                    break;
                case 0:
                    System.out.println("saindo...");
                    return;
                default:
                    System.out.println("Opção incorreta...");
                    break;
            }
        }
    }

    public static void exibirMenuOpcoes() {
        System.out.print(
                "[1] --- Ver Saldo\n" +
                "[2] --- Sacar\n" +
                "[3] --- Depositar\n" +
                "[0] --- Sair\n> "
        );
    }

}