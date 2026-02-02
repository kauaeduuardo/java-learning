package fundamentos.controledefluxo;

public class IfElse {
    public static void main(String[] args) {
        int idade = 18;

        // Executa blocos de código de acordo com uma condição.
        if (idade >= 18) {
            System.out.println("Maior de idade!");
        } else if (idade >= 12) {
            System.out.println("Adolescente!");
        } else {
            System.out.println("Criança!");
        }
    }
}
