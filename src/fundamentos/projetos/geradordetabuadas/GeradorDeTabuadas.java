package fundamentos.projetos.geradordetabuadas;

import java.util.Scanner;

public class GeradorDeTabuadas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("======== GERADOR DE TABUADAS COM JAVA :) ========");

        int opcao;

        while (true) {

            exibirOpcoes();
            System.out.print("\nDigite aqui sua escolha: ");
            opcao = entrada.nextByte();

            if (opcao == 1) {
                System.out.print("Digite o número para gerar a tabuada: ");
                int numero = entrada.nextInt();
                System.out.println("\nAqui está a tabuada de " + numero + ": ");
                gerarTabuada(numero);
            } else if (opcao == 2) {
                System.out.println("Tabuadas entre 1 e 10: ");
                gerarTabuadaUmADez();
            } else if (opcao == 3) {
                System.out.println("Encerrando gerador...");
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        }
    }

    public static void exibirOpcoes() {
        System.out.println("\n[Digite 1] - Para gerar a tabuada de um número específico!");
        System.out.println("[Digite 2] - Para gerar a tabuada de todos os números entre 1 e 10!");
        System.out.println("[Digite 3] - Para encerrar programa!");
    }

    public static void gerarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
        System.out.println("-------------------------");
    }

    public static void gerarTabuadaUmADez() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada de " + i + ": ");
            gerarTabuada(i);
        }
    }

}
