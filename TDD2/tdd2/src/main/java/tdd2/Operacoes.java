
package tdd2;

public class Operacoes {


    public double raiz(double num1) {

        return Math.sqrt(num1);

    }

    public double potenciar(double num1, double num2) {

        return Math.pow(num1, num2);

    }

    public double seno(double num1){
		return Math.sin(Math.toRadians(num1));
	}

    public double tangente(double num1){
        return Math.tan(Math.toRadians(num1));
    }

}
