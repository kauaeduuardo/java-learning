package poo.polimorfismo.teste;

import poo.polimorfismo.dominio.Celular;
import poo.polimorfismo.dominio.Tomate;
import poo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main() {
        Tomate tomate = new Tomate("Tomate cereja", 8.0, "31/04/2026");
        Celular celular = new Celular("Iphone 12", 7000);

        CalculadoraImposto.calculadoraImposto(tomate);
        System.out.println("-------------------------------");
        CalculadoraImposto.calculadoraImposto(celular);
    }
}
