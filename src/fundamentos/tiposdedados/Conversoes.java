package fundamentos.tiposdedados;

public class Conversoes {
    public static void main(String[] args) {
        // Conversão implícita
        int numInt = 100;
        double numDouble = numInt; // int → double (automático)
        System.out.println("Conversão implícita int → double: " + numDouble);

        // Conversão por cast
        // o cast força a transformação entre tipos numéricos (int, double, long, short etc)
        double valorDouble = 9.78;
        int valorInt = (int) valorDouble; // double → int (precisa de cast, perde a parte decimal)
        System.out.println("Conversão explícita double → int: " + valorInt);

        // Unicode
        char letra = 'A';
        int codigo = letra; // char → int (código unicode da letra)
        System.out.println("Char 'A' convertido para código Unicode: " + codigo);
        System.out.println("Código 66 convertido para char: " + (char) 66);
    }
}
