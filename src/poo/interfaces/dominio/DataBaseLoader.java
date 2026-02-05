package poo.interfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões em banco...");
    }
}
