package aula03;

public class Caneta {
    public String cor;
    public String modelo;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Modelo da Caneta: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO! A caneta está tampada");
        } else {
            System.out.println("Estou Rabiscando!");
        }
        
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}
