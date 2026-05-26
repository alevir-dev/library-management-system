package main.java.domain;

import main.java.enums.Type;

public class Professor extends Usuario{
    public Professor(String nome, String CPF) {
        super(nome, CPF, Type.PROFESSOR);
        setMAX_LIVROS(5);
    }
}
