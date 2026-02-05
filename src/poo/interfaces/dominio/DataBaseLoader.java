package poo.interfaces.dominio;

public class DataBaseLoader implements DataLoader {

    @Override
    public void load() {
        System.out.println("Carregando dados...");
    }
}
