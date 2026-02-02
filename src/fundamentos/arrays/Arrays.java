package fundamentos.arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        String[] listaDeCompras = new String[5];

        listaDeCompras[0] = "Goiaba";
        listaDeCompras[1] = "Pera";
        listaDeCompras[2] = "Farinha";
        listaDeCompras[3] = "Feijão";
        listaDeCompras[4] = "Arroz";

        for (int i = 0; i < listaDeCompras.length; i++) {
            System.out.println(listaDeCompras[i]);
        }

    }
}
