package main.java.domain;

public class Biblioteca {

    private final String nome;
    private static final int MAX_USERS = 500;
    private Usuario[] usuarios = new Usuario[MAX_USERS];
    private int posicaoUsuario = 0;

    private static final int MAX_BOOKS = 1500;
    private Livro[] livros = new Livro[MAX_BOOKS];
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

    public static int getMAX_USERS(){
        return MAX_USERS;
    }
    public static int getMAX_BOOKS(){
        return MAX_BOOKS;
    }

}
