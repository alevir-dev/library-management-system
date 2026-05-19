package main.java.service;

import main.java.domain.Biblioteca;
import main.java.domain.Livro;
import main.java.domain.Usuario;
import main.java.enums.StatusLivro;

public class BibliotecaService {
    Biblioteca biblioteca;


    public void adicionarUsuario(Usuario usuario) {

        biblioteca.getUsuarios()[biblioteca.getPosicaoUsuario()] = usuario;

        biblioteca.setPosicaoUsuario(biblioteca.getPosicaoUsuario() + 1);

        System.out.println("Usuário adicionado com sucesso!");
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {

        usuario.adicionarLivro(livro);

        livro.setStatus(StatusLivro.EMPRESTADO);
    }


}
