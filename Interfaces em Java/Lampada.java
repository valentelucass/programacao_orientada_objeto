interface Ligavel {
    void ligar();
    void desligar();
}

public class Lampada implements Ligavel {
    @Override
    public void ligar() {
        System.out.println("Lâmpada acesa.");
    }

    @Override
    public void desligar() {
        System.out.println("Lâmpada desligada.");
    }
}

class Ventilador implements Ligavel {
    @Override
    public void ligar() {
        System.out.println("Ventilador ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Ventilador desligado.");
    }
}

class TesteDeContrato {
    // Método de teste genérico para qualquer Ligavel
    public static void testarAparelho(Ligavel aparelho) {
        System.out.println("--- Testando o aparelho ---");
        aparelho.ligar();
        aparelho.desligar();
    }

    // O main deve estar dentro de uma classe (coloquei aqui)
    public static void main(String[] args) {
        Lampada minhaLampada = new Lampada();
        Ventilador meuVentilador = new Ventilador();

        // Use o método estático da mesma classe
        testarAparelho(minhaLampada);
        testarAparelho(meuVentilador);
    }
}
