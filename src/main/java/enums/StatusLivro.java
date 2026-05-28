package main.java.enums;

public enum StatusLivro {
    DISPONIVEL("Disponível"),
    EMPRESTADO("Emprestado");

    private String descricao;

    StatusLivro(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
