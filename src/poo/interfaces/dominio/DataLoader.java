package poo.interfaces.dominio;

public interface DataLoader  {
    // public abstract void load();
    void load();

    default void checkPermission() {
        System.out.println("Permissão checada!");
    }

    static void teste() {
        System.out.println("Testando");
    }
}
