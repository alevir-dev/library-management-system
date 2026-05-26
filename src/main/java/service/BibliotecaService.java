package main.java.service;

import main.java.domain.Biblioteca;
import main.java.domain.Livro;
import main.java.domain.Usuario;
import main.java.enums.StatusLivro;
import main.java.enums.Type;

public class BibliotecaService {
    Biblioteca biblioteca;


    public void adicionarUsuario(Usuario usuario) {

        biblioteca.getUsuarios()[biblioteca.getPosicaoUsuario()] = usuario;

        biblioteca.setPosicaoUsuario(biblioteca.getPosicaoUsuario() + 1);

        System.out.println("Usuário adicionado com sucesso!");
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (usuario.getPosicaoLivros() == usuario.getMAX_LIVROS()){
            System.out.println("O " + usuario.getType().getDescricao()+" atingiu o máximo de livros emprestados!");
            return;
        }
        usuario.adicionarLivro(livro);

        livro.setStatus(StatusLivro.EMPRESTADO);
    }


}
