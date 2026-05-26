package main.java.domain;

import main.java.enums.Type;

public class Bibliotecario extends Usuario{
    public Bibliotecario(String nome, String CPF) {
        super(nome, CPF, Type.BIBLIOTECARIO);
        setMAX_LIVROS(15);
    }
}
