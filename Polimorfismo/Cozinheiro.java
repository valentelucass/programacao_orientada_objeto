public class Cozinheiro {
    void prepararPrato() {
        System.out.println("Preparando um prato simples");
    }
    void prepararPrato(String nomePrato) {
        System.out.println("Preparando " + nomePrato + ".");
    }
}

class testePolimorfismo {
    public static void main (String[] args) {
        Cozinheiro c = new Cozinheiro();

        c.prepararPrato();
        c.prepararPrato("Pizza");
        c.prepararPrato("Sorvete");

    }
}