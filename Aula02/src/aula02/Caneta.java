package aula02;

public class Caneta {
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Modelo da Caneta: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    
    void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO! A caneta está tampada");
        } else {
            System.out.println("Estou Rabiscando!");
        }
        
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
