package aula11;

public class Bolsista extends Aluno {
    private int bolsa;
    
    public Bolsista(String nome, int idade, char sexo, int matricula, String curso){
        super(nome, idade, sexo, matricula, curso);
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa(){
        System.out.println("Renovando Bolsa de " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(getNome() + " é bolsista! pagamento facilitado!");
    }
}
