package main.java.enums;

public enum Type {
    BIBLIOTECARIO("Bibliotecario"),
    PROFESSOR("Professor"),
    ALUNO("Aluno");

    private String descricao;

    Type(String descricao) {
        this.descricao = descricao;
    }
}
