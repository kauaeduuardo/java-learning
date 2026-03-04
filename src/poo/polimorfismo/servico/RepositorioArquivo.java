package poo.polimorfismo.servico;

import poo.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando dados em um arquivo.");
    }
}
