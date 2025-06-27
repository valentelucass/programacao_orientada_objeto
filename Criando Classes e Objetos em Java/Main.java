public class Main {
    public static void main (String[] args) {
        Caneta c1 = new Caneta();
        System.out.println("==================================");
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.carga = 100;
        c1.ponta = 0.5f;
        c1.destampar(); // c1.tampada(); vai dar true, consequentemente o rabiscar vai dar outro resultado.
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        System.out.println("==================================");
        c2.modelo = "Faber Castel";
        c2.cor = "Vermelho";
        c2.carga = 50;
        c2.ponta = 1.0f;
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
}
