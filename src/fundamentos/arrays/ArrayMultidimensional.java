package fundamentos.arrays;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        int[][] numeros = new int[2][3]; //[linhas][colunas]

        numeros[0][0] = 1;
        numeros[0][1] = 1;
        numeros[0][2] = 1;
        
        numeros[1][0] = 0;
        numeros[1][1] = 0;
        numeros[1][2] = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j]);
            }
            System.out.println();
        }
        
    }
}
