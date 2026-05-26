package main.java.domain;

import main.java.enums.Type;

public class Aluno extends Usuario{

    public Aluno(String nome, String CPF) {
        super(nome, CPF, Type.ALUNO);
        setMAX_LIVROS(5);
    }
}
