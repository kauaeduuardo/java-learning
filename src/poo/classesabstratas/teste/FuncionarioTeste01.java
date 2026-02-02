package poo.classesabstratas.teste;

import poo.classesabstratas.dominio.Desenvolvedor;
import poo.classesabstratas.dominio.Funcionario;
import poo.classesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    static void main() {
        //Funcionario funcionario = new Funcionario("Zoro", 2000);
        // System.out.println(funcionario);
        Gerente gerente = new Gerente("Nami", 5000);
        // System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("chopper", 12000);
        // System.out.println(desenvolvedor);

        System.out.println(desenvolvedor);
        System.out.println(gerente);

        gerente.imprime();
        desenvolvedor.imprime();

    }
}
