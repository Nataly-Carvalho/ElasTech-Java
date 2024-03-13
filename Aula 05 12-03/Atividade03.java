import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args){
        /*
        * Escreva um programa em Java que solicita ao usuário
        * um número inteiro positivo e, em seguida,
        *  exibe uma contagem regressiva
        * a partir desse número até zero.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro Positivo: ");

        for (int j = scan.nextInt() ;j >=0; j--){
            System.out.println(j);
        }
        //Alertar se tiver numero negativo

        System.out.println("=================");
        System.out.println("Digite um numero inteiro Positivo: ");
        int i = scan.nextInt();
        if( i >= 0){
            for ( ;i >=0; i--){
                System.out.println(i);
            }
        }else{
            System.out.println("Numero invalido");
        }

    }
}
