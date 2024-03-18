import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        //2 - Escreva um programa que solicite um número ao usuário e exiba a tabuada desse número de 1 a 10.

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite qual tabuada você quer: ");
        int tabuada;
        int numero = scan.nextInt();
        for (int i =0; i<=10;i++){
            tabuada = numero * i;
            System.out.println(numero+ " x " +i +" = "+tabuada );
        }
    }
}
