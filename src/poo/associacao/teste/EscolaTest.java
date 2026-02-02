package poo.associacao.teste;

import poo.associacao.dominio.Aluno;
import poo.associacao.dominio.Escola;

public class EscolaTest {
    static void main() {
        Aluno aluno = new Aluno("Juliano");
        Aluno aluno2 = new Aluno("Juliana");
        Aluno[] alunos = {aluno, aluno2};
        Escola escola = new Escola("IFS", alunos);

        escola.imprime();
    }
}
