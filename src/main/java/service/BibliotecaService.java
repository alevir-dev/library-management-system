package main.java.service;

import main.java.domain.Biblioteca;
import main.java.domain.Livro;
import main.java.domain.Usuario;
import main.java.enums.StatusLivro;


public class BibliotecaService {
    Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal");
    private static final int MAX_USERS = 1000;
    private static final int MAX_BOOKS = 1000;


    public void adicionarLivro(Livro livro) {

        if (biblioteca.getLivros().size() == MAX_BOOKS) {
            System.out.println("Limite de livros atingido!");
            return;
        }

        biblioteca.getLivros().add(livro);

        System.out.println("Livro adicionado com sucesso!");

    }

    public void adicionarUsuario(Usuario usuario) {

        if (biblioteca.getUsuarios().size() == MAX_USERS) {
            System.out.println("Quantidade máxima de usuários atingida!");
            return;
        }

        biblioteca.getUsuarios().add(usuario);

        System.out.println("Usuário adicionado com sucesso!");
    }

    public Usuario buscarUsuario(String CPF) {

        for (int i = 0; i < biblioteca.getUsuarios().size(); i++) {

            if (biblioteca.getUsuarios().get(i).getCPF().equalsIgnoreCase(CPF)) {
                return biblioteca.getUsuarios().get(i);
            }
        }

        return null;
    }

    public Livro buscarLivro(String titulo) {

        for (int i = 0; i < biblioteca.getLivros().size(); i++) {
            if (biblioteca.getLivros().get(i).getTitulo().equalsIgnoreCase(titulo)) {
                return biblioteca.getLivros().get(i);
            }
        }
        return null;
    }

    public void listarLivros(){

        if (biblioteca.getLivros().isEmpty()){
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        for (int i = 0; i < biblioteca.getLivros().size(); i++){
            System.out.println("======================================");
            System.out.println(biblioteca.getLivros().get(i).getTitulo());
            System.out.println(biblioteca.getLivros().get(i).getAutor());
            System.out.println(biblioteca.getLivros().get(i).getPaginas());
            System.out.println(biblioteca.getLivros().get(i).getStatus());
        }
    }

    public void listarLivrosPorStatus(StatusLivro statusLivro){

        if (biblioteca.getLivros().isEmpty()){
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        boolean encontrou = false;

        for (int i = 0; i < biblioteca.getLivros().size(); i++){
            if (biblioteca.getLivros().get(i).getStatus().equals(statusLivro)){
                if (!encontrou){
                    System.out.println("======LIVROS " + statusLivro.getDescricao().toUpperCase() + "S=====");
                    encontrou = true;
                }
                System.out.println(biblioteca.getLivros().get(i).getTitulo());
                System.out.println(biblioteca.getLivros().get(i).getAutor());
                System.out.println(biblioteca.getLivros().get(i).getPaginas());
                System.out.println(biblioteca.getLivros().get(i).getStatus().getDescricao());
            }
        }

        if (!encontrou){
            System.out.println("Nenhum livro " + statusLivro.getDescricao() + " no momento.");
        }


    }

    public boolean isBookAvailable(String titulo) {

        Livro livro = buscarLivro(titulo);

        return livro != null && livro.getStatus() == StatusLivro.DISPONIVEL;
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (usuario.getLivros().size() == usuario.getMAX_LIVROS()) {
            System.out.println("O " + usuario.getType().getDescricao() + " atingiu o máximo de livros emprestados!");
            return;
        }

        if (isBookAvailable(livro.getTitulo())) {
            usuario.adicionarLivro(livro);

            livro.setStatus(StatusLivro.EMPRESTADO);

            System.out.println("Livro emprestado com sucesso!");

            return;
        }

        System.out.println("Livro indisponível para empréstimo!");


    }

    public void devolverLivro(Usuario usuario, String tituloLivro) {

        boolean encontrou = false;

        for (int i = 0; i < usuario.getLivros().size(); i++) {
            if (usuario.getLivros().get(i).getTitulo().equalsIgnoreCase(tituloLivro)) {
                encontrou = true;
                break;
            }

        }

        if (!encontrou) {
            System.out.println("Título não encontrado!");
            return;
        }

        usuario.removerLivro(tituloLivro);

        for (int i = 0; i < biblioteca.getLivros().size(); i++) {

            if (biblioteca.getLivros().get(i).getTitulo().equalsIgnoreCase(tituloLivro)) {
                biblioteca.getLivros().get(i).setStatus(StatusLivro.DISPONIVEL);
            }
        }


    }

}
