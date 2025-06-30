public class Main {
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();

        // Tentando abrir menu desligado
        System.out.println("Tentando abrir menu com controle desligado:");
        c1.abrirMenu();  // Deve mostrar que está desligado

        // Ligando o controle
        System.out.println("\nLigando o controle...");
        c1.ligar();

        // Aumentando volume
        System.out.println("\nAumentando o volume:");
        c1.maisVolume();
        c1.maisVolume();

        // Tocando
        System.out.println("\nDando play:");
        c1.play();

        // Abrindo menu
        System.out.println("\nAbrindo menu:");
        c1.abrirMenu();

        // Ativando mudo
        System.out.println("\nAtivando mudo:");
        c1.ligarMudo();
        c1.abrirMenu();

        // Desativando mudo
        System.out.println("\nDesativando mudo:");
        c1.desligarMudo();
        c1.abrirMenu();

        // Pausando
        System.out.println("\nPausando a reprodução:");
        c1.pause();
        c1.abrirMenu();

        // Diminuindo volume
        System.out.println("\nDiminuindo o volume:");
        c1.menosVolume();
        c1.abrirMenu();

        // Desligando
        System.out.println("\nDesligando o controle:");
        c1.desligar();
        c1.abrirMenu();

    }
}
