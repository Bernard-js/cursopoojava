package aula12;

public class Ave extends Animal{
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public int getIdade() {
        return idade;
    }

    public int getMembros() {
        return membros;
    }

    public float getPeso() {
        return peso;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
}
