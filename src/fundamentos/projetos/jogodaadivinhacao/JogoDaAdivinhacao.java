package fundamentos.projetos.jogodaadivinhacao;

import java.util.Scanner;
import java.util.Random;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        int numeroDeTentativas = 0;
        int numeroSorteado = gerador.nextInt(1, 100);
        int tentativa;

        String mensagemDica;

        System.out.println("---------------------------------");
        System.out.println("      JOGO DA ADIVINHAÇÃO");
        System.out.println("---------------------------------");
        System.out.println("Número secreto entre 1 e 100");

        System.out.println("Tente adivinhar :) ...\n");

        while (true) {

            System.out.print("Tentativa: ");
            tentativa = entrada.nextInt();
            numeroDeTentativas++;

            if (tentativa == numeroSorteado) {
                System.out.println("Você acertou!!!\nEm apenas " + numeroDeTentativas + " tentativas");
                break;
            }

            if (numeroDeTentativas == 1) {
                if (isNumeroPar(numeroSorteado)) {
                    System.out.println("O número secreto é par!");
                } else {
                    System.out.println("O número secreto é ímpar!");
                }
            }

            if (numeroDeTentativas == 3) {
                if (isNumeroPrimo(numeroSorteado)) {
                    System.out.println("O número sorteado é primo!");
                }
            }

            if (numeroDeTentativas == 5) {
                if (isMultiploDeTres(numeroSorteado)) {
                    System.out.println("O número secreto é múltiplo de 3!");
                }
            }

            if (numeroDeTentativas == 7) {
                if (isMultiploDeCinco(numeroSorteado)) {
                    System.out.println("O número secreto é múltiplo de 5!");
                }
            }

            mensagemDica = checarNumeroMaior(numeroSorteado, tentativa);
            System.out.println(mensagemDica + "\n");
        }
    }

    public static boolean isNumeroPar(int numeroSorteado) {
        return (numeroSorteado % 2 == 0);
    }

    public static String checarNumeroMaior(int numeroSorteado, int tentativa) {
        return (numeroSorteado > tentativa) ? "O número secreto é maior!" : "O número secreto é menor!";
    }

    public static boolean isNumeroPrimo(int numeroSorteado) {
        int numeroDeDivisores = 0;
        for (int i = 1; i <= numeroSorteado; i++) {
            if (numeroSorteado % i == 0) {
                numeroDeDivisores++;
            }
        }
        return (numeroDeDivisores == 2);
    }

    public static boolean isMultiploDeTres(int numeroSorteado) {
        return (numeroSorteado % 3 == 0);
    }

    public static boolean isMultiploDeCinco(int numeroSorteado) {
        return (numeroSorteado % 5 == 0);
    }

}
