package poo.polimorfismo.teste;

import poo.polimorfismo.repositorio.Repositorio;
import poo.polimorfismo.servico.RepositorioArquivo;
import poo.polimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest01 {
    static void main() {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();

        repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
