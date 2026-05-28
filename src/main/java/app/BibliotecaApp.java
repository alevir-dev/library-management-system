package main.java.app;

import main.java.domain.*;
import main.java.enums.Type;
import main.java.service.BibliotecaService;

import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BibliotecaService bibliotecaService = new BibliotecaService();

        int opcao = -1;
        String userName;
        String userCPF;
        int userTypeNumber;
        Type userType;
        String titleBook;
        int pagesBook;
        String authorBook;

        while (opcao != 0) {
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Cadastrar livro");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("5 - Listar livros da biblioteca");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.print("Digite uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do usuário: ");
                    userName = scanner.nextLine();
                    System.out.print("Digite o CPF do usuário: ");
                    userCPF = scanner.nextLine();
                    System.out.println("=========================");
                    System.out.println("Digite o tipo do usuário: ");
                    System.out.println("1 - Bibliotecário");
                    System.out.println("2 - Professor");
                    System.out.println("3 - Aluno");
                    System.out.print("Escolha entre as opções acima: ");
                    userTypeNumber = scanner.nextInt();
                    scanner.nextLine();

                    if (userTypeNumber == 1) {
                        userType = Type.BIBLIOTECARIO;
                    } else if (userTypeNumber == 2) {
                        userType = Type.PROFESSOR;
                    } else if (userTypeNumber == 3) {
                        userType = Type.ALUNO;
                    } else {
                        System.out.println("Digite uma opção válida!");
                        return;
                    }

                    if (userType == Type.BIBLIOTECARIO) {
                        bibliotecaService.adicionarUsuario(new Bibliotecario(userName, userCPF));
                    } else if (userType == Type.PROFESSOR) {
                        bibliotecaService.adicionarUsuario(new Professor(userName, userCPF));
                    } else {
                        bibliotecaService.adicionarUsuario(new Aluno(userName, userCPF));
                    }

                    break;

                case 2:
                    System.out.print("Digite o título do livro: ");
                    titleBook = scanner.nextLine();
                    System.out.print("Digite a quantidade de páginas: ");
                    pagesBook = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    authorBook = scanner.nextLine();

                    Livro livro = new Livro(titleBook, pagesBook, authorBook);

                    bibliotecaService.adicionarLivro(livro);
                    break;

                case 3:
                    System.out.print("Digite o CPF do usuário: ");
                    userCPF = scanner.nextLine();
                    Usuario usuarioBusca = bibliotecaService.buscarUsuario(userCPF);
                    if (usuarioBusca == null) {
                        System.out.println("Usuário não encontrado!");
                        return;
                    }
                    System.out.print("Digite o título do livro: ");
                    titleBook = scanner.nextLine();
                    Livro livroBusca = bibliotecaService.buscarLivro(titleBook);
                    if (livroBusca == null) {
                        System.out.println("Livro não encontrado!");
                        break;
                    }

                    bibliotecaService.emprestarLivro(usuarioBusca, livroBusca);
                    break;

                case 4:
                    System.out.print("Digite o CPF do usuário: ");
                    userCPF = scanner.nextLine();

                    Usuario usuarioDevolverLivro = bibliotecaService.buscarUsuario(userCPF);
                    if (usuarioDevolverLivro == null) {
                        System.out.println("Usuário não encontrado");
                        return;
                    }

                    System.out.print("Digite o titulo do livro que deseja devolver: ");
                    titleBook = scanner.nextLine();


                    bibliotecaService.devolverLivro(usuarioDevolverLivro, titleBook);
                    break;

                case 5:
                    System.out.println("=======LIVROS=======");
                    bibliotecaService.listarLivros();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

            }


        }


        scanner.close();


    }
}
