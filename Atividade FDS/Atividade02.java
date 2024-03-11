import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    /*1.Solicite o nome e a idade do usuário. Em seguida, exiba uma mensagem com essas informações.
            System.out.println("Qual seu nome?");
            String nome = scan.next();

            System.out.println("Qual sua idade?");
            int idade = scan.nextInt();

            System.out.println("Seu nome é "+ nome + " E sua idade é "+ idade);
            */

    /*2. Peça dois números ao usuário e realize operações de adição, subtração, multiplicação e divisão. Exiba os resultados.
            System.out.println("Digite um numero:");
            int numero = scan.nextInt();
            System.out.println("Digite outro numero");
            int numero2 = scan.nextInt();

            System.out.println("A soma dos numero da " + (numero + numero2));
            System.out.println("A subtração dos numeros da " + (numero-numero2));
            System.out.println("A Multiplicação dos numeros da " + (numero*numero2));
            System.out.println("A divisão dos numeros da " + (numero/numero2));
    */

    /*3. Crie um programa que verifica se um número digitado pelo usuário é positivo, negativo ou zero.
            System.out.println("Digite um numero");
            int numero = scan.nextInt();

            if (numero>=0){
                System.out.println("O numero é Positivo");
            }else {
                System.out.println("O numero é negativo");
            }
    */


    /*4. Solicite ao usuário um dia da semana (em formato numérico de 1 a 7) e exiba o nome correspondente usando um bloco switch.
            System.out.println("Digite um numero que referente a um dia da semana");
            int diaSemana = scan.nextInt();

            switch (diaSemana){
                case 1:
                    System.out.println("Segunda");
                    break;
                case 2:
                    System.out.println("Terça");
                    break;
                case 3:
                    System.out.println("Quarta");
                    break;
                case 4:
                    System.out.println("Quinta");
                    break;
                case 5:
                    System.out.println("Sexta");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Numero invalido");
                    break;
                }
    */


    /*
    5. "Escreva um programa em Java que solicita ao usuário um número inteiro. Com base nesse número, o programa deve realizar as seguintes ações:

    1. Se o número for positivo, armazene-o em uma variável e exiba uma mensagem indicando que é positivo.
    2. Se o número for negativo, armazene o valor absoluto em uma variável e exiba uma mensagem indicando que é negativo.
    3. Utilize um bloco switch para verificar se o número é par ou ímpar. Exiba uma mensagem correspondente.

            System.out.println("Digite um número inteiro:");
            int numero = scan.nextInt();

            if (numero >= 0) {
                System.out.println("O número é positivo.");
            } else {
                numero = Math.abs(numero);
                System.out.println("O número é negativo. Valor absoluto: " + numero);
            }

            switch (numero % 2) {
                case 0:
                    System.out.println("O número é par.");
                    break;
                case 1:
                    System.out.println("O número é ímpar.");
                    break;
            }
    */

/*
    6 -
    Desenvolva um programa em Java para simular um sistema de pedidos de uma loja online. O programa deve:

    1. Solicitar ao usuário que insira o valor total de sua compra.
    2. Com base nesse valor, aplicar descontos conforme as seguintes regras:
    Se o valor for maior que R$ 200, aplique um desconto de 10%.
    Se o valor estiver entre R$ 100 e R$ 200, aplique um desconto de 5%.
    Caso contrário, não aplique desconto.
    3. Exiba o valor final a ser pago pelo usuário após o desconto.
    Além disso, implemente um menu utilizando um switch para permitir ao usuário escolher o método de pagamento:
    Opção 1: Cartão de crédito
    Opção 2: Boleto bancário
    Opção 3: Transferência bancária*/

        System.out.println("Digite o valor total da sua compra: ");
        double ValorTotal = scan.nextDouble();
        double ValorDesconto;
        System.out.println("Escolha como você deseja pagar a conta");
        System.out.println("Digite 1 - Cartão de crédito \nDigite 2 - Boleto bancário \nDigite 3 - Transferência bancária");
        int MetodoPagamento = scan.nextInt();

        if(ValorTotal>200){
            ValorDesconto = ValorTotal * 0.10;
            System.out.println("10% de desconto aplicado");
        } else if (ValorTotal <= 200 && ValorTotal>=100) {
            ValorDesconto = ValorTotal * 0.5;
            System.out.println("5% de Desconto aplicado");
        } else {
            ValorDesconto = ValorTotal;
            System.out.println("Sem desconto");
        }

        switch (MetodoPagamento){
            case 1:
                System.out.println("Compra Paga pelo Cartão");
                break;
            case 2:
                System.out.println("Compra Paga pelo Boleto");
                break;
            case 3:
                System.out.println("Compra paga por transferencia bancaria");
                break;
            default:
                System.out.println("Numero invalido");
                break;
        }
        ValorTotal = ValorTotal - ValorDesconto;
        System.out.println("O total da compra deu: " + ValorTotal);


    }
}
