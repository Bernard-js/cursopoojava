package aula12;

public class Aula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        
        m.setPeso(85.9f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
        p.setPeso(2.80f);
        p.setIdade(23);
        p.setMembros(1);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();
        
        a.setPeso(10.3f);
        a.setIdade(5);
        a.setMembros(10);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        
        c.setPeso(20.0f);
        c.setIdade(40);
        c.setMembros(2);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        
        k.setPeso(34.3f);
        k.setIdade(32);
        k.setMembros(24);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.enterrarOsso();
        k.abanarRabo();
        
    }
    
}
