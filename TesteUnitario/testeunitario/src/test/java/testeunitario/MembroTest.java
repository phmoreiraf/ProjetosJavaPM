package testeunitario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MembroTest {
    private Membro membro;
    private Livro livro;

    @BeforeEach
    public void setUp() {
        membro = new Membro(1, "Pedro Ferreira");
        livro = new Livro(1, "Os dez Mandamentos", "R. W. Dale");
    }

    @Test
    public void testCriarMembro() {
        assertEquals(1, membro.getId());
        assertEquals("Pedro Ferreira", membro.getNome());
        assertTrue(membro.getLivrosEmprestados().isEmpty());
    }

    @Test
    public void testMembroRetornaLivro() {
        membro.pegarEmprestado(livro);
        membro.retornarLivro(livro);
        assertFalse(membro.getLivrosEmprestados().contains(livro));
    }
}

