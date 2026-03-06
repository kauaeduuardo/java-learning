package throwable.exception;

import java.io.FileNotFoundException;

public class FinallyTest01 {
    static void main(String[] args) {
        try {
            lerDadosArquivo();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando arquivo..."); // executa de qualquer jeito
        }
    }

    public static void lerDadosArquivo() throws FileNotFoundException{
        System.out.println("Abrindo arquivo.");
        System.out.println("Escrevendo dado.");

        // exceção forçada
        throw new FileNotFoundException();
    }
}
