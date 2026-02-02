package poo.associacao.teste;

import poo.associacao.dominio.Jogador;
import poo.associacao.dominio.Time;

public class JogadorTest3 {
    static void main(String[] args) {
        Jogador jogador = new Jogador("Dudu");
        Jogador jogador2 = new Jogador("Rony");
        Time time = new Time("Atlético Mineiro");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---------------");
        jogador.imprime();

        System.out.println("---------------");
        time.imprime();
    }
}
