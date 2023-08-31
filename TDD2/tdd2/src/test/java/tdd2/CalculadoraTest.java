package tdd2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

   private Operacoes calcular = new Operacoes();

    @Test
    public void testRaiz() {
        double raiz = calcular.raiz(81);
        assertEquals(9, raiz, 0.01);
    }

    @Test
    public void testPotencia() {
        double potencia = calcular.potenciar(10,2);
        assertEquals(100, potencia, 0.01);
    }

    @Test
    public void testTangente(){
        assertEquals(0.54, calcular.tangente(31), 0.01);
    }

}

