package main.java.domain;

public class Livro {
    private final String titulo;
    private final int paginas;
    private final String autor;


    public Livro(String titulo, int paginas, String autor) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getAutor() {
        return autor;
    }
}
