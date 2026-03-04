package poo.polimorfismo.servico;

import poo.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando dados em um banco de dados.");
    }
}
