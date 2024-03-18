import java.util.ArrayList;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
    //6 - Faça um programa que solicite ao usuário números inteiros positivos.
    // Quando o usuário digitar um número negativo, o programa deve exibir a média dos números inseridos até aquele momento.
        Scanner scan = new Scanner(System.in);
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
}
