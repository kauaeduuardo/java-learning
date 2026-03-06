package throwable.runtimeexception;

public class RuntimeException02 {
    static void main() {
        sacar(20);

        try {
            sacar(-100);
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("continua...");
    }

    public static void sacar(double valor) throws RuntimeException { // Opcional, avisa ao chamador
        if (valor <= 0) {
            throw new RuntimeException("Impossível sacar valores negativos ou zero.");
        } else {
            System.out.println("sacando R$" + valor);
        }
    }
}
