package aula13;

public class Aula13 {

    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();
        
        Cachorro c2 = new Cachorro();
        Lobo l2 = new Lobo();
        Mamifero m2 = new Mamifero();
        
        //Polimorfismo de Sobreposição
        c2.emitirSom();
        l2.emitirSom();
        m2.emitirSom();
        
        //Polimorfismo de Sobrecarga
        c.reagir("toma comida");
        c.reagir("vai apanhar!");
        c.reagir(11, 30);
        c.reagir(16, 45);
        c.reagir(true);
        c.reagir(false);
        c.reagir(3, 20.0f);
        c.reagir(7, 3.0f);
    }
    
}
