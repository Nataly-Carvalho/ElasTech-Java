package LacosRepeticaoMetodo;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void contagemRegressiva(){
        for(int i = 10; i>=1; i--){
            System.out.println(i);
        }
    }

    public static void tabuada(){
        System.out.println("Digite qual tabuada você quer: ");
        int tabuada;
        int numero = scan.nextInt();
        for (int i =0; i<=10;i++){
            tabuada = numero * i;
            System.out.println(numero+ " x " +i +" = "+tabuada );
        }
    }

    public static void somaPar(){
        int soma =0;

        for(int i = 0; i<=100;i++){
            if (i %2 == 0){
                soma+=i;

            }
        }
        System.out.println("As somas dos numeros é: " + soma);
    }

    public static void primo(){
        boolean primo = true;

        System.out.println("Digite um número inteiro: ");
        int numero = scan.nextInt();

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    primo = false;
                }
            }
        }
        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }

    static void Fibonacci(){
        int n = 20;

        int[] sequencia = new int[n];

        sequencia[0] = 1;
        sequencia[1] = 1;

        for(int i=2; i <n;i++){
            sequencia[i] = sequencia[i-1] + sequencia[i-2];
        }
        System.out.println("Os primeiros 20 números da sequência de Fibonacci são:");
        for (int i = 0; i<n; i++){
            System.out.println(sequencia[i]+ " ");
        }
    }

    static void positivo(){
        ArrayList<Integer> numeros = new ArrayList<>();
        double soma = 0 , media = 0;
        int cont = 0;
        while (true){
            System.out.println("Digite um numero: ");
            int numero = scan.nextInt();
            if (numero < 0){
                break;
            }else {
                cont ++;
            }
            numeros.add(numero);
            soma += numero;
        }
        media = soma / cont;

        System.out.print("A média dos números  é: " + media);
    }
    static void calculadora(){
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
    public static void jogoSorte(){
        Random random = new Random();

        int palpite = 0, numerodasorte = random.nextInt(100) + 1;
        System.out.println("=========================================================");
        System.out.println("=============🎮Vamos iniciar o jogo 🎮===================");
        System.out.println("=🤖Você deve acertar o número que o robô está pensando🤖=");
        System.out.println("==========================================================");

        while (palpite != numerodasorte) {
            System.out.print("Digite seu palpite: ");
            palpite = scan.nextInt();
            if (palpite == numerodasorte) {
                System.out.println("🎉🎉🎉 Parabéns! Você acertou 🎉🎉🎉");
            } else {
                System.out.println("Tente novamente ❌");
                if (numerodasorte < palpite){
                    System.out.println("Digite um numero menor ⬇️");

                } else if (numerodasorte > palpite) {
                    System.out.println("Digite um numero maior ⬆️");

                }
            }
        }
    }
    public static void conversor(){
        int continuar;
        double fahren, cel;
        do {
            System.out.println("---------------------------------------");
            System.out.println("Qual temperatura você deseja converter?");
            System.out.println("--------------------------------------- \n");
            System.out.println("De Fahrenheit para Celsius digite -1- \nDe Celsius para Fahrenheit digite -2-");
            int op = scan.nextInt();

            switch (op){
                case 1:
                    System.out.println("Digite a temperatura em Fahrenheit:");
                    fahren = scan.nextInt();
                    cel = (fahren - 32)/1.8;
                    System.out.println("A temperatura é de: ºC "+ cel);
                    break;
                case 2:
                    System.out.println("Digite a temperatura em Celsius:");
                    cel = scan.nextInt();
                    fahren = (cel*1.8) + 32;
                    System.out.println("A temperatura é de: ºF "+ fahren);
                    break;
                default:
                    System.out.println("Opcão invalida");
            }
            System.out.println("---------------------------------------------------------");
            System.out.println("Deseja fazer outra conversão? \nDigite 1 para continuar ou qualquer outro numero para sair");
            System.out.println("----------------------------------------------------------");
            continuar = scan.nextInt();
        }while (continuar ==1);
    }

    public static void listaCompras(){
        ArrayList<String> lista = new ArrayList<>();
        int continuar;
        do {
            System.out.println("===================================");
            System.out.println("=========Lista de compras==========");
            System.out.println("===================================\n");
            System.out.println("Adicione um item a lista de compras");
            String item = scan.next();
            lista.add(item);
            System.out.println("Lista de compra atualizada com sucesso!");

            System.out.println("===================================");
            System.out.println(lista);
            System.out.println("===================================\n");

            System.out.println("Deseja Adicionar mais um item?: 1/sim ou 2/Não");
            continuar= scan.nextInt();
        }while (continuar == 1);
    }
    public static void main(String[] args) {
        //contagemRegressiva();
        //tabuada();
        //somaPar();
        //primo();
        //positivo();
        //calculadora();
        //conversor();
        //listaCompras();
    }
}
