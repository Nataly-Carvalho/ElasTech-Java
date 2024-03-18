import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[4];

        numeros[1] = 10;
        numeros[3] = 8;
        numeros[0] = 9;
        numeros[2] = 4;

        System.out.println("O valor na posição 1 = "+ numeros[1]);

        String[] nomes = new String[3];

        nomes[1] = "Nataly";
        nomes[0] = "Erica";
        nomes[2] = "Rafael";

        for (int i = 0; i<3; i++){
            System.out.println("O valor na possição "+i+" = " + nomes[i]);
        }

        int[] numero = new int[5];
        int aux = numero.length;

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira um numero: ");
            numero[i] = scan.nextInt();
        }

        for (int i = 0; i < aux- 1; i++) {
            for (int j = 0; j < i; j++) {
                if (numero[j] > numero[j + 1]) {
                    int temp = numero[j];
                    numero[j] = numero[j + 1];
                    numero[j + 1] = temp;
                }
            }
        }
        System.out.println("Números em ordem Decrescente: ");
        for (int i = 0; i < aux; i++) {
            System.out.println(numero[i]+" " );
        }


    }
}

