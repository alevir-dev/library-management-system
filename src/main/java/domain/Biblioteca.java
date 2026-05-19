package main.java.domain;

public class Biblioteca {

    private final String nome;

    private Usuario[] usuarios = new Usuario[500];
    private int posicaoUsuario = 0;

    private Livro[] livros = new Livro[1500];
    private int posicaoLivro = 0;

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public int getPosicaoUsuario() {
        return posicaoUsuario;
    }

    public void setPosicaoUsuario(int posicaoUsuario) {
        this.posicaoUsuario = posicaoUsuario;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public int getPosicaoLivro() {
        return posicaoLivro;
    }

    public void setPosicaoLivro(int posicaoLivro) {
        this.posicaoLivro = posicaoLivro;
    }

}
