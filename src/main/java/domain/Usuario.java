package main.java.domain;

public class Usuario {
    private final String nome;
    private final String CPF;
    private static final int MAX_LIVROS = 10;

    private Livro[] livros = new Livro[MAX_LIVROS];
    private int posicaoLivros = 0;

    public Usuario(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public int getPosicaoLivros() {
        return posicaoLivros;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }
}