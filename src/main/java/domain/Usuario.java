package main.java.domain;

import main.java.enums.Type;

public abstract class Usuario {
    private final String nome;
    private final String CPF;
    private final Type type;
    private int MAX_LIVROS;

    private Livro[] livros;
    private int posicaoLivros = 0;

    public Usuario(String nome, String CPF, Type type) {
        this.nome = nome;
        this.CPF = CPF;
        this.type = type;
    }

    public void adicionarLivro(Livro livro) {
        this.livros[posicaoLivros] = livro;
        posicaoLivros++;

        System.out.println("Livro adicionado com sucesso!");
    }

    public void removerLivro(String tituloLivro) {
        int salvarPosicao = -1;

        for (int i = 0; i < posicaoLivros; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(tituloLivro)) {
                salvarPosicao = i;
                break;
            }
        }

        if (salvarPosicao == -1) {
            System.out.println("Título não encontrado!");
            return;
        }

        for (int i = salvarPosicao; i < posicaoLivros - 1; i++) {
            livros[i] = livros[i + 1];
        }

        livros[posicaoLivros - 1] = null;
        posicaoLivros--;

        System.out.println("Livro devolvido com sucesso!");
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

    public int getMAX_LIVROS() {
        return MAX_LIVROS;
    }

    public void setMAX_LIVROS(int MAX_LIVROS) {
        this.MAX_LIVROS = MAX_LIVROS;
        this.livros = new Livro[MAX_LIVROS];
    }

    public Type getType() {
        return type;
    }
}