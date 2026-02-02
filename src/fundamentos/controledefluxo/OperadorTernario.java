package fundamentos.controledefluxo;

public class OperadorTernario {
    public static void main(String[] args) {
        // O operadore ternário funciona como um if/else simplificado

        String mensagem = (1000 % 2 == 0) ? "Par" : "Ímpar"; // (condicao) ? caso true : caso false;
        System.out.println(mensagem);
    }
}
