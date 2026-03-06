package throwable.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest02 {
    static void main(String[] args) throws IOException {
        // Exceções checadas devem ser explicitamente tratadas ou o programa finaliza

        lerArquivo("dados.txt"); // ler arquivo lança uma exceção
        System.out.println("Fim da execução.");
    }

    public static void lerArquivo(String caminho) throws IOException {
        File arquivo = new File(caminho);
        FileReader leitor = new FileReader(arquivo); // lança FileNotFoundException se não existir
        System.out.println("Arquivo aberto com sucesso!");
        leitor.close();
    }
}
