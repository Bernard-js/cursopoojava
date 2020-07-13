package aula05;

public class ContaBancaria {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBancaria(int numeroConta, String dono) {
        this.dono = dono;
        this.numConta = numeroConta;
        this.status = false;
        this.saldo = 0;        
    }
    
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
    
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (getTipo().equalsIgnoreCase("CC")) {
            setSaldo(50f);
            System.out.println("Conta Aberta com sucesso!");
        } else if (getTipo().equalsIgnoreCase("CP")) {
            setSaldo(150f);            
            System.out.println("Conta Aberta com sucesso!");
        } else {
            System.out.println("Falha ao abrir a conta. escreva 'cc' para abrir uma conta corrente "
                    + "ou 'cp' para abrir uma conta poupança");
        }
    }
    
    public void fecharConta(){
        if (saldo > 0f){
            System.out.println("Você precisa sacar " + saldo + " reais");
        } else if (saldo < 0f) {
            System.out.println("Você está devendo " + saldo + " reais para o banco.");
        } else {
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float dinheiro){
        if (isStatus()) {
             setSaldo(getSaldo() + dinheiro);
        } else {
            System.out.println("Você precisa abrir sua conta para depositar.");
        }
    }
    
    public void sacar(float dinheiro){
        if (isStatus()) {
            if (getSaldo() <= 0f) {
                System.out.println("Você não pode sacar pois possui saldo insuficiente");
            } else {
                setSaldo(getSaldo() - dinheiro);
            }
        } else {
            System.out.println("Você precisa abrir sua conta para depositar");
        }
    }
    
    public void pagarMensal(){
        float valor = 0;
        if (getTipo().equalsIgnoreCase("cc")) {
            valor = 12f;
        }
        if (getTipo().equalsIgnoreCase("cp")) {
            valor = 20f;
        }
        
        if (isStatus()) {
            if (getSaldo() < valor) {
                System.out.println("Saldo insuficiente");
            } else {
                setSaldo(getSaldo() - valor);
            }
        } else {
            System.out.println("você precisa ter a conta aberta para pagar a mensalidade");
        }
    }
    
    public void estadoAtual(){
        System.out.println("Tipo da conta: " + getTipo());
        System.out.println("Numero da conta: " + getNumConta());
        System.out.println("Dono da conta: " + getDono());
        System.out.println("Saldo: R$" + getSaldo() + "0");
        System.out.println("a conta está aberta? " + isStatus());
    }
}
 