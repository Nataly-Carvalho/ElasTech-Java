import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args){
    //7 - Crie uma calculadora simples que permita ao usuário realizar operações de soma, subtração,
    // multiplicação e divisão entre dois números, utilizando um laço de repetição para continuar operando até que o usuário decida sair.

        Scanner scan = new Scanner(System.in);


        System.out.println("------------------------------------------");
        System.out.println("--------------Calculadora-----------------");
        System.out.println("------------------------------------------");
        double resultado;
        int continuar;

        do {
            System.out.print("Digite o primeiro número: ");
            double numero1 = scan.nextDouble();

            System.out.println("Qual operação que deseja realizar:");
            System.out.println(" + - * /");
            String op = scan.next();

            System.out.print("Digite o segundo número: ");
            double numero2 = scan.nextDouble();

            switch (op){
                case "+":
                    resultado = numero1+numero2;
                    System.out.println(numero1+ " + " + numero2 + " = " + resultado);
                    break;
                case "-":
                    resultado = numero1-numero2;
                    System.out.println(numero1+ " - " + numero2 + " = " + resultado);
                    break;
                case "*":
                    resultado = numero1*numero2;
                    System.out.println(numero1+ " * " + numero2 + " = " + resultado);
                    break;
                case "/":
                    resultado = numero1/numero2;
                    System.out.println(numero1+ " / " + numero2 + " = " + resultado);
                    break;
                default:
                    System.out.println("Opção invalida!");
            }

            System.out.print("Deseja continuar ( 1 = sim/ 2 = não)? ");
            continuar = scan.nextInt();

        }while (continuar == 1);

        System.out.println("Obrigado por usar a calculadora!");
    }
}
