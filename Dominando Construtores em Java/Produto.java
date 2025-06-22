public class Produto {
    private String nome;
    private double preco;

    /*
     * ESTE É O 1º CONSTRUTOR (SOBRECARGA)
     * Função: Criar um produto informando APENAS o nome.
     * Como funciona: Ele recebe o nome que você passa e, por padrão,
     * define o preço como 0.0. É uma forma rápida de cadastrar
     * um item que ainda não tem um valor definido.
     * Exemplo de uso: new Produto("Mouse sem fio");
     */

    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
    }

    /*
     * ESTE É O 2º CONSTRUTOR (SOBRECARGA)
     * Função: Criar um produto completo, com nome E preço.
     * Como funciona: Ele exige que você passe as duas informações
     * (nome e preço) para criar o objeto já com todos os dados.
     * Exemplo de uso: new Produto("Teclado Mecânico", 250.50);
     */

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("--- Informações do Produto ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + String.format("%.2f", this.preco));
        System.out.println("----------------------------");
    }

    public static void main (String[] args) {

        Produto produto1 = new Produto("Mouse sem fio");
        produto1.exibirInfo();

        Produto produto2 = new Produto("Teclado Mecânico", 250.50);
        produto2.exibirInfo();

        Produto produto3 = new Produto ("Monitor AOC", 890.99);
        produto3.exibirInfo();


    }
}
