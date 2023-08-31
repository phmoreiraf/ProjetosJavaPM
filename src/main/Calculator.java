package main;

public class Calculator {
	private double resultado;

	public double soma(double a, double b) {
		return a + b;
	}

	public double sub(double a, double b) {
		return a - b;
	}

 public double raiz(double num1) {

        return Math.sqrt(num1);

    }

    public double potenciar(double num1, double num2) {

        return Math.pow(num1, num2);

    }
}
