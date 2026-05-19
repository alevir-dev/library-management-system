package main.java.domain;


import main.java.enums.StatusLivro;

public class Livro {

    private final String titulo;
    private final int paginas;
    private final String autor;

    private StatusLivro status = StatusLivro.DISPONIVEL;

    public Livro(String titulo, int paginas, String autor) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.autor = autor;
    }

    public void setStatus(StatusLivro status) {
        this.status = status;
    }

    public StatusLivro getStatus() {
        return status;
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
