/*1) Escreva em Java uma classe Contador, que encapsule um valor usado para contagem de
itens ou eventos. A classe deve oferecer métodos que devem:
a) Zerar;
b) Incrementar;
c) Retornar o valor do contador.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("Digite um numero: ");
        System.out.println("------------------");
        int valor = scan.nextInt();

        Contador cont = new Contador(valor);
        System.out.println("------------------------------------------------");
        System.out.println("O valor do Contador Atualmente é de: " + cont.getContador());
        System.out.println("------------------------------------------------");
        cont.incremento();
        cont.incremento();
        cont.incremento();
        cont.incremento();
        System.out.println("------------------------------------------------");
        System.out.println("O valor do Contador Atualmente é de: " + cont.getContador());
        System.out.println("------------------------------------------------");
        cont.zerar();
        System.out.println("------------------------------------------------");
        System.out.println("O valor do Contador Atualmente é de: " + cont.getContador());
        System.out.println("------------------------------------------------");

    }

}
