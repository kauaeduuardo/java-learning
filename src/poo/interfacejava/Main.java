package poo.interfacejava;

public class Main {
    public static void main(String[] args) {

        Pagavel p1 = new Funcionario("João", 3000.0, 500.0);
        Pagavel p2 = new Produto("Notebook", 2500.0, 2);

        System.out.println(p1);  // Chama o toString() de Funcionario
        System.out.println(p2);  // Chama o toString() de Produto

        Pagavel[] pagamentos = {p1, p2};
        double total = 0;

        for (Pagavel p : pagamentos) {
            total += p.calcularPagamento();
        }

        System.out.println("\nTotal geral a pagar: R$ " + total);
    }
}