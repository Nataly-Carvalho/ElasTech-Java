import java.util.Scanner;

public class OperadoresTernarios {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        // ? = if | : = else
        System.out.println(( scan.nextInt()>=18) ? "Você é maior de idade": "Voce é menor de idade");

    }
}
