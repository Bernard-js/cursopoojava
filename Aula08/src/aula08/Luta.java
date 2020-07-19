package aula08;

import aula07.Lutador;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    private int vencedor;
    
    private final Random random = new Random();

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);
        } else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }
    
    public void lutar(){
        if (aprovada) {
            desafiado.apresentar();
            desafiante.apresentar();
            vencedor = random.nextInt(3);
            
            switch (vencedor){
                case 0:
                    System.out.println("empate!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome() + " Ganhou!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:  
                    System.out.println(desafiante.getNome() + " Ganhou!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
            
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
}
