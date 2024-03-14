import java.util.Scanner;

public class LacoDeRepeticaoFor2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int i, idade, cont = 0, cont2=0;

        for(i=0; i < 10; i++){
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
            System.out.println("Digite seu nome: ");
            String nome[];
            if (idade>=18){
                cont++;
                System.out.println("Usuario maior de idade");
            }else{
                cont2++;
                System.out.println("Usuario menor de idade");
            }
        }
        System.out.println("A quantidade de pessoas maiores de idade é "+cont);
        System.out.println("A quantidade de pessoas menores de idade é " + cont2);
    }
}
