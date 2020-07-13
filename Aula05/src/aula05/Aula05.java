package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(12, "Roberto");
        c1.abrirConta("cp");
        c1.depositar(20f);
        c1.estadoAtual();
    }    
}
