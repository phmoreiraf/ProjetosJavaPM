package testeunitario;
import java.util.*;


public class Membro {
    private int id;
    private String nome;
    private List<Livro> livrosEmprestados;

    public Membro(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void pegarEmprestado(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void retornarLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }
}
