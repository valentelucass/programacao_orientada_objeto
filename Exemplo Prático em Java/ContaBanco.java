import java.util.Random;

public class ContaBanco {
    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public ContaBanco() {
        this.numConta = new Random().nextInt(90000) + 10000; // número entre 10000 e 99999
        this.setSaldo(0f);
        this.setStatus(false);
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);  // Atribuindo diretamente o tipo
        this.setStatus(true);
        if (this.getTipo().equals("CC")) {
            this.setSaldo(50f);
        } else if (this.getTipo().equals("CP")) {
            this.setSaldo(150f);
        }
        System.out.println("Conta nº " + this.getNumConta() + " aberta com sucesso para " + this.getDono());
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta ainda tem saldo positivo: R$" + this.getSaldo());
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta está em débito: R$" + this.getSaldo());
        } else {
            this.setStatus(false);
            System.out.println("Conta de " + this.getDono() + " fechada com sucesso!");
        }
    }

    public void depositar(float valor) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito de R$" + valor + " realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em conta fechada.");
        }
    }

    public void sacar(float valor) {
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque de R$" + valor + " realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossível sacar de conta fechada.");
        }
    }

    public void pagarMensal() {
        int mensalidade;
        if (this.getTipo().equals("CC")) {
            mensalidade = 12;
        } else if (this.getTipo().equals("CP")) {
            mensalidade = 20;
        } else {
            System.out.println("Tipo de conta inválido para cobrança de mensalidade.");
            return;
        }

        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - mensalidade);
            System.out.println("Mensalidade de R$" + mensalidade + " debitada na conta de " + this.getDono());
        } else {
            System.out.println("Impossível cobrar mensalidade de conta fechada.");
        }
    }

    // getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
