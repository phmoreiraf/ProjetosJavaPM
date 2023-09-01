
package tdd2;

import java.util.*;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Operacoes realizar = new Operacoes();

        int escolha;
        double resultado;

            do {
                System.out.println("Calculadora");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("5 - Seno");
                System.out.println("6 - Cosseno");
                System.out.println("7 - Tangente");
                System.out.println("8 - Raiz Quadrada");
                System.out.println("9 - Potenciação");
                System.out.println("0 - Sair");
                System.out.println("Escolha uma operação:");
                escolha = scanner.nextInt();
                scanner.nextLine();
                switch (escolha) {
                    case 1:
                    System.out.println("Selecione o primeiro número para somar:");
                    double soma1 = scanner.nextDouble();
                    System.out.println("Selecione o segundo número para somar:");
                    double soma2 = scanner.nextDouble();
                    double resultSoma = realizar.soma(soma1, soma2);
                    System.out.println("Resultado: " + resultSoma);

                        break;
                    case 2:
                    System.out.println("Selecione o primeiro número para subtrair:");
                    double sub1 = scanner.nextDouble();
                    System.out.println("Selecione o segundo número para subtrair:");
                    double sub2 = scanner.nextDouble();
                    double resultSub = realizar.sub(sub1, sub2);
                    System.out.println("Resultado: " + resultSub);

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        System.out.println("Digite um valor para calcular seu seno: ");
                        double sin = scanner.nextDouble();
                        resultado = realizar.seno(sin);
                        System.out.printf("O seno de " + sin + " é, aproximadamente, %.2f.%n", resultado);
                        break;
                    case 6:
                        System.out.print("Digite o ângulo em graus: ");
                        double cos = scanner.nextDouble();
                        resultado = realizar.cosseno(cos);
                        System.out.println("Cosseno: " + resultado + "do angulo: " + cos + "graus.");
                        break;
                    case 7:
                        System.out.print("Digite um valor para calcular sua tangente: ");
                        double tan = scanner.nextDouble();
                        resultado = realizar.tangente(tan);
                        System.out.printf("A tangente de %.2f é, aproximadamente, %.2f.\n", tan, resultado);
                        break;
                    case 8:
                        System.out.print("Digite o número: ");
                        double numero = scanner.nextDouble();
                        resultado = realizar.raiz(numero);
                        System.out.printf("Raiz Quadrada de %.2f é, aproximadamente, %.2f.\n", numero, resultado);
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
                        if(escolha == 0){
                            break;
                        }
                        System.out.println("Opção inválida!\nPor favor, escolha uma opção válida.");

                        break;
                }
            }while(escolha != 0);
        System.out.println("Encerrando a calculadora...");
        System.exit(escolha);
        scanner.close();
    }

}
