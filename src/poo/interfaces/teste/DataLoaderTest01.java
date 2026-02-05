package poo.interfaces.teste;

import poo.interfaces.dominio.DataBaseLoader;
import poo.interfaces.dominio.DataLoader;
import poo.interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        fileLoader.load();
        dataBaseLoader.load();
    }
}
