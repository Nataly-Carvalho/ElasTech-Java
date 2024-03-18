import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        //4 - Escreva um programa que verifique se um número digitado pelo usuário é primo ou não.

        Scanner scan = new Scanner(System.in);

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
}