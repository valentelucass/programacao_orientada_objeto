public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String novoNome) {
        nome = "Notebook";
    }

    public void setPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
        } else {
            System.out.println("Erro: O preço deve ser um valor positivo.");
        }
    }

    void mostrarInfo() {
        System.out.println("Exibir nome: " + nome);
        System.out.println("Exibir preço: " + preco);
    }

    public static void main(String[] args) {
        Produto meuProduto = new Produto();
        meuProduto.setNome("Notebook");
        meuProduto.setPreco(3500.00);
        meuProduto.mostrarInfo(); // precisa chamar o método, senão os resultados acimas não serão exibidos.

        System.out.println("Exibir nome atual: " + meuProduto.getNome());
        System.out.println("Preço atual: R$" + meuProduto.getPreco());
    }
}
