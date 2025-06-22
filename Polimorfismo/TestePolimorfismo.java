class Veiculo { // Tiramos o public pois exigiriam estar em um arquivo separado
    void mover() {
        System.out.println("Se movimentam no geral");
    }
}

class Carro extends Veiculo {
    void mover() {
        System.out.println("Carro acelera na estrada");
    }
}

class Bicicleta extends Veiculo {
    void mover() {
        System.out.println("Bicicleta pedala na ciclovia");
    }
}

public class TestePolimorfismo {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.mover();

        Bicicleta minhaBicicleta = new Bicicleta();
        minhaBicicleta.mover();

        Veiculo meuVeiculo = new Carro();
        meuVeiculo.mover();

        meuVeiculo = new Bicicleta();
        meuVeiculo.mover();
    }
}
