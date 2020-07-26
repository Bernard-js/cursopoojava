package aula11;

public class Tecnico extends Aluno{

    private String registroProfissional;
    
    public Tecnico(String nome, int idade, char sexo, int matricula, String curso) {
        super(nome, idade, sexo, matricula, curso);
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    public void praticar(){
        
    }
}
