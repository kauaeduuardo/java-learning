package fundamentos.arrays;

public class ArraysComplemento {
    public static void main(String[] args) {
        // formas de incializar um array
        int[] numeros1 = new int[5];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};

        // foreach - forma simplificada de percorrer um array
        for (int num : numeros2) {
            System.out.print(num + " ");
        }
    }
}
