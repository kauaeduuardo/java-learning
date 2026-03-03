package poo.polimorfismo.servico;

import poo.polimorfismo.dominio.Produto;
import poo.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calculadoraImposto(Produto produto) {
        System.out.println("Relatório imposto " + produto.getNome());
        System.out.println("Valor: R$" + produto.getPreco());
        double taxaImposto = produto.calcularImposto();
        System.out.println("Impostos: R$" + taxaImposto);
        if (produto instanceof Tomate) {
            System.out.println("Data de validade: " + ((Tomate) produto).getDataValidade());
        }
    }

}
