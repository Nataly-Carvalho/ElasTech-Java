import java.util.Scanner;

public class Operadores2 {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
        /*
        int numero = 10;
        if (numero == 10){
            System.out.println("O valor é igual a 10");
        }else{
            System.out.println("O valor é diferente de 10");
        }
    */
    /*

    System.out.println("Qual a sua idade? ");
    int idade = scan.nextInt();
    if (idade>= 18){
        System.out.println("Bem vindo");
    }else{
        System.out.println("Você não pode acessar");
    }*/

    /*
    System.out.println("Digite um numero:");
    int numero = scan.nextInt();
    if (numero %2 ==0){
        System.out.println("Seu numero é par");
    }else{
        System.out.println("Seu numero é impar");
    }
    */

            System.out.println("Digite sua nota final");
            double nota = scan.nextDouble();
            
            if(nota>=7){
                System.out.println("Aprovado");
            } else if (nota >=6) {
                System.out.println("Recuperação");
            }else {
                System.out.println("Reprovado");
            }


        }
}
