
package testeunitario;

//import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Membro> membros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.membros = new ArrayList<>();
    }

    public void registrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(int livroId, int membroId) {
        Livro livro = buscarLivroPorId(livroId);
        Membro membro = buscarMembroPorId(membroId);

        if (livro != null && membro != null) {
            if (!livro.isEmprestado()) {
                livro.emprestar();
                membro.pegarEmprestado(livro);
                System.out.println("Livro emprestado com sucesso.");
            } else {
                System.out.println("Livro já emprestado.");
            }
        } else {
            System.out.println("Livro ou membro não encontrado.");
        }
    }

    public void retornarLivro(int livroId, int membroId) {
        Livro livro = buscarLivroPorId(livroId);
        Membro membro = buscarMembroPorId(membroId);

        if (livro != null && membro != null) {
            if (livro.isEmprestado() && membro.getLivrosEmprestados().contains(livro)) {
                livro.retornar();
                membro.retornarLivro(livro);
                System.out.println("Livro retornado com sucesso.");
            } else {
                System.out.println("Livro não emprestado para este membro.");
            }
        } else {
            System.out.println("Livro ou membro não encontrado.");
        }
    }

    public void adicionarMembro(Membro membro) {
        membros.add(membro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public void removerMembro(int membroId) {
        Membro membro = buscarMembroPorId(membroId);
        if (membro != null) {
            membros.remove(membro);
            System.out.println("Membro removido com sucesso.");
        } else {
            System.out.println("Membro não encontrado.");
        }
    }

    public void removerLivro(int livroId) {
        Livro livro = buscarLivroPorId(livroId);
        if (livro != null) {
            livros.remove(livro);
            System.out.println("Livro removido com sucesso.");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public void listarLivros() {
        System.out.println("Lista de Livros:");
        for (Livro livro : livros) {
            System.out.println("ID: " + livro.getId() + ", Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
        }
    }

    public void listarMembros() {
        System.out.println("Lista de Membros:");
        for (Membro membro : membros) {
            System.out.println("ID: " + membro.getId() + ", Nome: " + membro.getNome());
        }
    }

    private Livro buscarLivroPorId(int livroId) {
        for (Livro livro : livros) {
            if (livro.getId() == livroId) {
                return livro;
            }
        }
        return null;
    }

    private Membro buscarMembroPorId(int membroId) {
        for (Membro membro : membros) {
            if (membro.getId() == membroId) {
                return membro;
            }
        }
        return null;
    }
}
