package aula14;

public class Aula14 {

    public static void main(String[] args) {
        Video[] v = new Video[3];
        Gafanhoto[] g = new Gafanhoto[3];
        
        v[0] = new Video("Aula de Java");
        v[1] = new Video("Aula de C#");
        v[2] = new Video("Aula de C++");
        
        g[0] = new Gafanhoto("Geraldo", "Geraldo", 30, 'M');
        g[1] = new Gafanhoto("Rodrigo", "Rodrigo", 20, 'M');
        g[2] = new Gafanhoto("Juliana", "Juliana", 23, 'F');

        Visualizacao[] vis = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[2] = new Visualizacao(g[1], v[1]);
        
        vis[0].avaliar();
        vis[1].avaliar(54f);
        vis[2].avaliar(3);
                
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].toString());
        }
        
        for (int i = 0; i < g.length; i++) {
            System.out.println(g[i].toString());
            
        }
        
        for (int i = 0; i < vis.length; i++) {
            System.out.println(vis[i].toString());
        }
        
    }
    
}
