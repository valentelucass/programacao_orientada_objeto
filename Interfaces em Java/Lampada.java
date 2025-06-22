interface Ligavel {
    void ligar();
    void desligar();
}

public class Lampada implements Ligavel {
    // @Override garante que o método ligar() está implementando corretamente o método da interface Ligavel.
    // Ajuda a evitar erros (ex.: nome ou assinatura errada) e melhora a clareza do código.
    @Override
    public void ligar() {
        System.out.println("Luz ligada.");
    }

    // @Override confirma que desligar() está implementando o método da interface Ligavel.
    // O compilador verifica se a assinatura é idêntica, prevenindo bugs sutis.
    @Override
    public void desligar() {
        System.out.println("Luz desligada.");
    }
}