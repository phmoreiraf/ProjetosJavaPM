package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {
	Calculator calculator = new Calculator();

	@Test
    public void testSoma() {
        
        double result = calculator.soma(2, 3);
        assertEquals(5, result);
    }
	
	
	@Test
	public void testSub() {
		double result = calculator.sub(5,3);
		assertEquals(2, result);
	}

	    @Test
    public void testRaiz() {
        double raiz = calculator.raiz(81);
        assertEquals(9, raiz, 0.01);
    }

    @Test
    public void testPotencia() {
        double potencia = calculator.potenciar(10,2);
        assertEquals(100, potencia, 0.01);
    }

}
