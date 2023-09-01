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
    public void testSeno(){
        double seno = calcular.seno(42);
        assertEquals(0.6691, seno, 0.01);
    }

    @Test
    public void testTangente(){
        assertEquals(1.0, calcular.tangente(45), 0.01);
    }

    @Test
    public void testSoma(){
        double result = calcular.soma(6, 1);
        assertEquals(7, result);
    }

    @Test
    public void testSub(){
        double result = calcular.sub(10, 6);
        assertEquals(6, result);
    }

    @Test
    public void testCosseno() {
        double cosseno = calcular.cosseno(90);
        assertEquals(0, cosseno, 0.01);
    }

    
    @Test
    public void testMultiplicar() {
        double multiplicar = calcular.multiplicar(1,2);
        assertEquals(2, multiplicar, 0.01);
    }

    @Test
    public void testDividir() {
        double dividir = calcular.dividir(10,2);
        assertEquals(5, dividir, 0.01);
    }


}

