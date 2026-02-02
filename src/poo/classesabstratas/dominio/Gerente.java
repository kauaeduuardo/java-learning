package poo.classesabstratas.dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void aumento() {
        this.salario += salario * 0.05;
    }


    @Override
    public void imprime() {
        System.out.println("gerente imprime...");
    }
}
