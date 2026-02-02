package fundamentos.arrays;

public class ArrayMultidimensionalComplemento {
    public static void main(String[] args) {
        // formas de inicializar
        int[][] numeros = new int[2][5];
        int[][] numeros2 = new int[2][];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = j + 1;
            }
        }

        // foreach em array multidimensional
        for (int[] arraybase : numeros) {
            for (int num : arraybase) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
