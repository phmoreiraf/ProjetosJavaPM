package testeunitario;

import java.util.*;
//import java.io.*;
//import java.lang.*;

    public class Main {
        public static void main(String[] args) {
            Biblioteca biblioteca = new Biblioteca();
            Livro livro = new Livro(0, "", "");
            Scanner sc = new Scanner(System.in);

            int escolha, livroId, membroId;
            String titulo, autor;

            while (true) {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Registrar livro");
                System.out.println("2 - Emprestar livro");
                System.out.println("3 - Retornar livro");
                System.out.println("0 - Sair");

                escolha = sc.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("Digite o ID do livro:");
                        livroId = sc.nextInt();
                        System.out.println("Digite o título do livro:");
                        sc.nextLine();
                        titulo = sc.nextLine();
                        System.out.println("Digite o autor do livro:");
                        autor = sc.nextLine();
                        livro = new Livro(livroId, titulo, autor);
                        biblioteca.registrarLivro(livro);
                        System.out.println("Livro registrado com sucesso.");
                        break;

                    case 2:
                        System.out.println("Digite o ID do livro a ser emprestado:");
                        livroId = sc.nextInt();
                        System.out.println("Digite o ID do membro que deseja pegar emprestado:");
                        membroId = sc.nextInt();
                        biblioteca.emprestarLivro(livroId, membroId);
                        break;

                    case 3:
                        System.out.println("Digite o ID do livro a ser retornado:");
                        livroId = sc.nextInt();
                        System.out.println("Digite o ID do membro que está devolvendo:");
                        membroId = sc.nextInt();
                        biblioteca.retornarLivro(livroId, membroId);
                        break;

                    case 0:
                        System.out.println("Saindo do programa.");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
}
