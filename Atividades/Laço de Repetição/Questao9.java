import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args){
    //9 -  Escreva um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa,
    // solicitando ao usuário qual conversão deseja fazer. O programa deve continuar executando até que o usuário decida sair.

        Scanner scan = new Scanner(System.in);

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
}
