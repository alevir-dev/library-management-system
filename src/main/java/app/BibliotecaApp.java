package main.java.app;

import main.java.domain.Aluno;
import main.java.domain.Bibliotecario;
import main.java.domain.Livro;
import main.java.domain.Professor;
import main.java.service.BibliotecaService;

public class BibliotecaApp {
    public static void main(String[] args) {

        BibliotecaService bibliotecaService = new BibliotecaService();

        Livro livroArteDaGuerra = new Livro("A arte da guerra",200, "Autor X");

        bibliotecaService.adicionarLivro(livroArteDaGuerra);

        Aluno aluno1 = new Aluno("Levi", "385-947-832-13");
        Aluno aluno2 = new Aluno("Thiago", "385-947-832-13");
        Aluno aluno3 = new Aluno("Renan", "385-947-832-13");

        Professor professor = new Professor("Ticiana", "385-947-832-13");

        Bibliotecario bibliotecario = new Bibliotecario("Fanor", "385-947-832-13");



        bibliotecaService.adicionarUsuario(aluno1);
        bibliotecaService.adicionarUsuario(aluno2);
        bibliotecaService.adicionarUsuario(aluno3);

        bibliotecaService.adicionarUsuario(professor);

        bibliotecaService.adicionarUsuario(bibliotecario);

        bibliotecaService.emprestarLivro(aluno1, livroArteDaGuerra);
    }
}
