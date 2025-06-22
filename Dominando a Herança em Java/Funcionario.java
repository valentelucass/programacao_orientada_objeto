public class Funcionario {
    String nome;

    // Este método não usa 'public static' porque, na Programação Orientada a Objetos,
    //  ele é chamado através de uma instância (objeto) da classe.
    void trabalhar() {
        System.out.println("Funcionário trabalhando...");
    }

    public Funcionario(String nome) {
        this.nome = nome; // Aqui ele foi inicializado
    }
}

class Gerente extends Funcionario { // Sem 'public': assim posso ter as duas classes no mesmo arquivo.
    String departamento; // Agora existe o atributo no objeto!

    public static void main(String[] args) {

        Gerente g1 = new Gerente("Lucas", "Financeiro");
        g1.trabalhar();
        g1.aprovarVerba();
    }

    public Gerente(String nome, String departamento) {
        super(nome); // Inicializa o nome usando o construtor da superclasse
        this.departamento = departamento; // Inicializa o departamento específico do gerente
    }

    @Override // Sobrescrevendo o método da classe pai
    void trabalhar() {
        System.out.println("O gerente está gerenciando a equipe.");
    }

    void aprovarVerba() {
        System.out.println("Verba aprovada para o departamento " + this.departamento); //this.departamento significa: pegue o atributo departamento do objeto.
    }

}