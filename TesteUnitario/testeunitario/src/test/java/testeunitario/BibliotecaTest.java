package testeunitario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {
    private Biblioteca biblioteca;
    private Membro membro;
    private Livro livro;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
        membro = new Membro(1, "Pedro Henrique");
        livro = new Livro(1, "Diario de um banana", "Jeff Kinney");
    }

    @Test
    public void testRegistrarLivro() {
        biblioteca.registrarLivro(livro);
        assertTrue(biblioteca.getLivros().contains(livro));
    }

    @Test
    public void testEmprestarLivroParaMembro() {
        biblioteca.registrarLivro(livro);
        biblioteca.emprestarLivro(1, 1);
        assertFalse(livro.isEmprestado());
        assertFalse(membro.getLivrosEmprestados().contains(livro));
    }

    @Test
    public void testRetornarLivroDeMembro() {
        biblioteca.registrarLivro(livro);
        biblioteca.emprestarLivro(1, 1);
        biblioteca.retornarLivro(1, 1);
        assertFalse(livro.isEmprestado());
        assertFalse(membro.getLivrosEmprestados().contains(livro));
    }

    @Test
    public void testEmprestarLivroNaoDisponivel() {
        biblioteca.registrarLivro(livro);
        biblioteca.emprestarLivro(1, 1);
        biblioteca.emprestarLivro(1, 1);
        assertFalse(livro.isEmprestado());
    }
}
