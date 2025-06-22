class Produto {
    double calcularPreco() {
        return 0.0;
    }
}

class Livro extends Produto {
    double precoFixo = 50.0;

    double calcularPreco() {
        return precoFixo;
    }
}

class Eletronico extends Produto {
    double precoBase = 100.0;

    double calcularPreco() {
        return precoBase * 0.9; // 10% de desconto
    }
}

class TesteLoja {
    public static void main(String[] args) {
        Produto[] carrinho = { new Livro(), new Eletronico() };
        double total = 0.0;

        // Versão tradicional com índice
        for (int i = 0; i < carrinho.length; i++) {
            Produto p = carrinho[i]; // Pega o produto na posição i
            double preco = p.calcularPreco();
            total += preco;
            System.out.println("Preço do produto: " + preco);
        }

        System.out.println("Total: " + total);
    }
}
