package aula09;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Elon", 30, "M");
        
        Livro l1 = new Livro("O Príncipe", "Machiavelli", 400, p1);
        
        System.out.println(p1.getNome());
        System.out.println(l1.detalhes());
    }
    
}
