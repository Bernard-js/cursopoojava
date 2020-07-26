package aula11;

public class Aluno extends Pessoa {
    
    private int matricula;
    private String curso;
    
    public Aluno(String nome, int idade, char sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.curso = curso;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", curso=" + curso + '}';
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void pagarMensalidade() {
        System.out.println("Pagando Mensalidade do aluno " + getNome());
    }
        
}
