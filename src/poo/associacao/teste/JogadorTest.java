package poo.associacao.teste;

import poo.associacao.dominio.Jogador;

public class JogadorTest {
    static void main() {
        Jogador jogador1 = new Jogador("carlos");
        Jogador jogador2 = new Jogador("Zé");
        Jogador jogador3 = new Jogador("Bale");

        Jogador[] time = new Jogador[]{jogador1, jogador2, jogador3};
        for (Jogador j : time) {
            System.out.println(j.getNome());
        }
    }
}
