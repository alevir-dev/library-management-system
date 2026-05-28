package main.java.domain;

import java.util.ArrayList;

public class Biblioteca {

    private final String nome;
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    private ArrayList<Livro> livros = new ArrayList<Livro>();


    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
}
