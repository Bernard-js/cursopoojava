package aula14;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(espectador.getTotAssistido() + 1);
        this.filme.setViews(filme.getViews() + 1);
    }
    
    public void avaliar(){
        filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){
        int n = 0;
        if (porc <= 25) {
            n = 3; 
        } else if (porc <= 50) {
            n = 5;
        } else if (porc <= 75) { 
            n = 8;
        } else {
            n = 10;
        }
        filme.setAvaliacao(n);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
