package poo.associacao.teste;

import java.util.Scanner;

public class LerTeclado {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = in.nextLine();
        System.out.println(nome);
    }
}
