package aula09;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = true;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo 
                + ", autor=" + autor 
                + ", totPaginas=" + totPaginas 
                + ", pagAtual=" + pagAtual 
                + ", aberto=" + aberto 
                + ", leitor=" + leitor + '}';
    }
    
    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p > 0 && p < totPaginas) {
            setPagAtual(p);
        } else {
            System.out.println("Página inválida");
        }
    }

    @Override
    public void avancarPag() {
        if (getPagAtual() > 0 && getPagAtual() < getTotPaginas()) {
            this.pagAtual++;
        } else {
            System.out.println("Página inválida!");
        }
    }

    @Override
    public void voltarPag() {
        if (getPagAtual() > 0 && getPagAtual() < getTotPaginas()) {
            pagAtual--;
        } else {
            System.out.println("Página inválida!");
        }
    }
}
