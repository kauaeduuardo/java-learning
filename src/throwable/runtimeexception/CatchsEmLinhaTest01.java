package throwable.runtimeexception;

public class CatchsEmLinhaTest01 {
    static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (RuntimeException e) { // exceção mais genérica
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static int divisao(int a, int b) {
        return a / b;
    }
}
