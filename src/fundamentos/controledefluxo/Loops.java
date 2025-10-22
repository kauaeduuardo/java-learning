package fundamentos.controledefluxo;

public class Loops {
    public static void main(String[] args) {
        // Quantidade de repetições definidade
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Quantidade de repetições indefinida "fazer até que"
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        // Repetir pelo menos uma vez
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 10);
    }
}
