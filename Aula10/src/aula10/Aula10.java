package aula10;

public class Aula10 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("", 25, 'M');
        Aluno p2 = new Aluno("", 21, 'F', 3123, "");
        Professor p3 = new Professor("", 0.0f, "", 45, 'M');
        Funcionario p4 = new Funcionario("", 35, 'F', "", true);
        
        p1.setNome("Alex");
        p2.setNome("Roberta");
        p3.setNome("Rodrigo");
        p4.setNome("Fernanda");
        
        p2.setCurso("Engenharia");
        p3.setSalario(4000.0f);
        p3.setEspecialidade("Geometria Plana");
        p4.setSetor("Vendas");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
              
             
    }
    
}
