package poo.polimorfismo.teste;

import poo.polimorfismo.dominio.Celular;
import poo.polimorfismo.dominio.Produto;
import poo.polimorfismo.dominio.Tomate;
import poo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    static void main() {
        Produto produto1 = new Tomate("Tomate cereja", 8.0, "31/04/2026");
        Produto produto2 = new Celular("Iphone 12", 7000);

        CalculadoraImposto.calculadoraImposto(produto1);
        System.out.println("-------------------------------");
        CalculadoraImposto.calculadoraImposto(produto2);
    }
}
