package testeunitario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {
    private Livro livro;

    @BeforeEach
    public void setUp() {
        livro = new Livro(1, "Diario de um banana", "Jeff Kinney");
    }

    @Test
    public void testCriarLivro() {
        assertEquals(1, livro.getId());
        assertEquals("Diario de um banana", livro.getTitulo());
        assertEquals("Jeff Kinney", livro.getAutor());
        assertFalse(livro.isEmprestado());
    }

}
