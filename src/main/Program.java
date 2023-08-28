package main;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Calculator realizar = new Calculator();

        double num1, num2, resultado;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Calculadora");
            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("0 - Sair");

            int escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Encerrando a calculadora...");
                break;
            }

            switch (escolha) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = realizar.soma(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = realizar.sub(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }
}
