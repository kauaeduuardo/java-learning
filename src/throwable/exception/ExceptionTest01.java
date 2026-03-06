package throwable.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest01 {
    static void main(String[] args) {
        // Exceções checadas devem ser explicitamente tratadas ou o programa finaliza
        try {
            lerArquivo("dados.txt"); // ler arquivo lança uma exceção
        } catch (IOException e) { // captura e exibe qual foi o problema
            System.out.println("Erro ao ler arquivo." + e.getMessage());
        }
        System.out.println("Fim da execução.");
    }

    public static void lerArquivo(String caminho) throws IOException {
        File arquivo = new File(caminho);
        FileReader leitor = new FileReader(arquivo); // lança FileNotFoundException se não existir
        System.out.println("Arquivo aberto com sucesso!");
        leitor.close();
    }
}
