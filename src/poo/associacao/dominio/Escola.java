package poo.associacao.dominio;

public class Escola {
    private String nome;
    private Aluno[] alunos;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Aluno[] alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (alunos == null) {
            return;
        }
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
