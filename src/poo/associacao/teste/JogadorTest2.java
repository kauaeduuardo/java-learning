package poo.associacao.teste;

import poo.associacao.dominio.Jogador;
import poo.associacao.dominio.Time;

public class JogadorTest2 {
    static void main() {
        Jogador j1 = new Jogador("Pelé");
        Time time = new Time("Santos");
        j1.setTime(time);
        j1.imprime();
    }
}
