package aula11;

public class Aula11 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante("Jonas", 19, 'M');
        Aluno a1 = new Aluno("Gabriel", 23, 'M', 23321, "Direito");
        Professor p1 = new Professor("História", 40000.0f, "Clarisse", 37, 'F');
        Bolsista b1 = new Bolsista("Rodrick", 25, 'M', 2930930, "Eng.");
        Tecnico t1 = new Tecnico("Lara", 21, 'F', 543765, "Eletrônica");
        
        p1.fazerAniv();
        a1.pagarMensalidade();
        b1.pagarMensalidade();
        b1.renovarBolsa();
    }
    
}
