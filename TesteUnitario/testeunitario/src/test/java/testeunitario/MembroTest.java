package testeunitario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MembroTest {
    private Membro membro;
    private Livro livro;

   

    @Test
    public void testCriarMembro() {
        assertEquals(1, membro.getId());
        assertEquals("Pedro Ferreira", membro.getNome());
        assertTrue(membro.getLivrosEmprestados().isEmpty());
    }


   
}

