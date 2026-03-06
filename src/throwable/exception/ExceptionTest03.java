package throwable.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest03 {
    static void main(String[] args) {
        try {
            lerArquivo("dados.txt");
        } catch (IOException e) {
            System.out.println("erro:" + e.getMessage());
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
