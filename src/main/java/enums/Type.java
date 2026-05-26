package main.java.enums;

public enum Type {
    BIBLIOTECARIO("Bibliotecário"),
    PROFESSOR("Professor"),
    ALUNO("Aluno");

    private String descricao;

    Type(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
