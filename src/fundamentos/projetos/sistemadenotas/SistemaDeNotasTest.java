package fundamentos.projetos.sistemadenotas;

import java.util.Scanner;

public class SistemaDeNotasTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nomeDoAluno;
        double[] notas = new double[4];
        double somaDasNotas;

        System.out.println("Sistema de Notas - Escola X");
        System.out.println("------------------------------------");

        while (true) {

            System.out.print("Informe o nome do aluno ou Fim [para finalizar]: ");
            nomeDoAluno = entrada.nextLine();
            if (nomeDoAluno.equals("fim") || nomeDoAluno.equals("Fim") || nomeDoAluno.equals("FIM")) {
                break;
            } else {
                somaDasNotas = 0;
                for (int i = 0; i < notas.length; i++) {
                    System.out.print("Nota " + (i + 1) + ": ");
                    notas[i] = entrada.nextDouble();
                    boolean leituraValida = isValorValido(notas[i]);
                    if (leituraValida) {
                        somaDasNotas += notas[i];
                    } else {
                        System.out.println("Entrada inválida - tentar novamente. ");
                        i--;
                    }
                }

                double mediaFinal = calcularMedia(somaDasNotas, notas.length);
                String statusDoAluno = exibirStatusAluno(mediaFinal);
                exibirInformacoesAluno(nomeDoAluno, mediaFinal, statusDoAluno);

            }
            limparBufferDeEntrada(entrada);
        }
        System.out.println("Finalizando programa...");
    }

    public static boolean isValorValido(double nota) {
        return nota >= 0 && nota <= 10;
    }

    public static double calcularMedia(double somaDasNotas, double quantidade) {
        return (somaDasNotas / quantidade);
    }

    public static String exibirStatusAluno(double media) {
        if (media >= 7.00) {
            return "Aprovado.";
        } else if (media >= 5.00 && media < 7.00) {
            return "Em recuperação.";
        } else {
            return "Reprovado";
        }
    }

    public static void exibirInformacoesAluno(String nomeDoAluno, double media, String status) {
        System.out.println("------------------------------------");
        System.out.println("Aluno: " + nomeDoAluno);
        System.out.println("Média: " + media);
        System.out.println("Status: " + status);
        System.out.println("------------------------------------\n");
    }

    public static void limparBufferDeEntrada(Scanner entrada) {
        entrada.nextLine();
    }
}
