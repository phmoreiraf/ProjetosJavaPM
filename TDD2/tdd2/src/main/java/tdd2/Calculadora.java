
package tdd2;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Operacoes realizar = new Operacoes();

        double num1, num2, angulo;
        double resultado;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Calculadora");
            System.out.println("Escolha a operação:");
            System.out.println("8 - Raiz Quadrada");
            System.out.println("9 - Potenciação");
            System.out.println("0 - Sair");

            int escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Encerrando a calculadora...");
                System.exit(escolha);
                break;
            }

            switch (escolha) {
                case 1:

              
                case 2:

 
                case 3:

    
                case 4:

         
                case 5:
           
                case 6:
   
                case 7:
              
               case 8:
                    System.out.print("Digite o número: ");
                    double numero = scanner.nextDouble();
                    resultado = realizar.raiz(numero);
                    System.out.println("Raiz Quadrada de : " + numero + "sera: " + resultado);
                    break;
                case 9:
                    System.out.print("Digite a base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite o expoente: ");
                    double expoente = scanner.nextDouble();
                    resultado = realizar.potenciar(base, expoente);
                    System.out.println("Potenciação: " + resultado);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        scanner.close();
    }
}
