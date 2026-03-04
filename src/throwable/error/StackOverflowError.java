package throwable.error;

public class StackOverflowError {
    static void main() {
        recursiva();
        // A função gerou um estouro de pilha
    }

    public static void recursiva() {
        recursiva();
    }
}
