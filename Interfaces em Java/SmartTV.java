interface Ligavel2 {
    void ligar();
    void desligar();
}

interface Conectavel {
    void conectarWifi();
}

public class SmartTV implements Ligavel2, Conectavel {
    @Override
    public void ligar() {
        System.out.println("Lâmpada acesa.");
    }
    @Override
    public void desligar() {
        System.out.println("Lâmpada desligada.");
    }
    @Override
    public void conectarWifi() {
        System.out.println("SmartTV: Conectado à rede Wi-Fi.");
    }
}

class TesteMultiplo {
    public static void main(String[] args) {
        SmartTV minhaTV = new SmartTV();

        minhaTV.conectarWifi();
        minhaTV.desligar();
        minhaTV.ligar();
    }
}