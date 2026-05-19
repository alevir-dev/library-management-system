package main.java.service;

import main.java.domain.Biblioteca;
import main.java.domain.Usuario;

public class BibliotecaService {
    Biblioteca biblioteca;


    public void adicionarUsuario(Usuario usuario) {

        biblioteca.getUsuarios()[biblioteca.getPosicaoUsuario()] = usuario;

        biblioteca.setPosicaoUsuario(biblioteca.getPosicaoUsuario() + 1);

        System.out.println("Usuário adicionado com sucesso!");
    }


}
