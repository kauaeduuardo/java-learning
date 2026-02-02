package poo.classesabstratas.dominio;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void aumento() {
        this.salario += salario * 0.10;
    }

    @Override
    public void imprime() {
        System.out.println("desenvolvedor imprime");
    }
}
