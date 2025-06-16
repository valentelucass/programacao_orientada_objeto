public class Cachorro { // 1) Criar sua primeira Classe
    String nome;
    int idade;

    public static void latido() { // 2) Adicionar uma Ação (Método)
        System.out.println("Au, au...");
    }

    int calcular_idade() { // 3) Criar um Método com Retorno
        return idade * 12;
    }

    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.nome = "Bebê";
        dog.idade = 17;

        System.out.println("Nome do cachorro: " + dog.nome);
        System.out.println("Idade do cachorro: " + dog.idade);
        System.out.println("Idade em meses: " + dog.calcular_idade());
        latido();

    }
}
