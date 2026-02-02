package poo.heranca.teste;

import poo.heranca.dominio.Funcionario;
import poo.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Elano","123.456.789-12",29);
        pessoa.imprime();

        System.out.println("--------------------------");

        Funcionario funcionario = new Funcionario("Luiz","12345677",34,1800);
        funcionario.imprime();
    }
}
