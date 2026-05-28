package main.java.domain;

import main.java.enums.Type;

import java.util.ArrayList;

public abstract class Usuario {
    private final String nome;
    private final String CPF;
    private final Type type;
    private int MAX_LIVROS;

    private ArrayList<Livro> livros = new ArrayList<Livro>();

    public Usuario(String nome, String CPF, Type type) {
        this.nome = nome;
        this.CPF = CPF;
        this.type = type;
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void removerLivro(String tituloLivro) {
        boolean removeu = livros.removeIf(livros -> livros.getTitulo().equalsIgnoreCase(tituloLivro));

        if (!removeu) {
            System.out.println("Título não encontrado!");
            return;
        }

        System.out.println("Livro devolvido com sucesso!");
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getMAX_LIVROS() {
        return MAX_LIVROS;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setMAX_LIVROS(int MAX_LIVROS) {
        this.MAX_LIVROS = MAX_LIVROS;
    }

    public Type getType() {
        return type;
    }
}