package fundamentos.controledefluxo;

public class SwitchCase {
    public static void main(String[] args) {
        int dia = 3;

        // Usado para escolher entre vários blocos de código com base no valor de uma variável.
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }

    }
}
