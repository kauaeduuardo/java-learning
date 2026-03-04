package throwable.runtimeexception;

public class RunTimeException {
    static void main() {
        // O compilador não exige tratamento, por ser erro de lógica.

        int[] numeros = {1,2,4,3};
        System.out.println(numeros[1]);
        System.out.println(numeros[4]); // indice fora do array

    }
}
