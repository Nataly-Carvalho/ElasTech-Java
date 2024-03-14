import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numero;
        numero = 15;

        int[] numeros = new int[3];
        //[ 9| 10 | 5]
        numeros[0] = 9;
        numeros[1] = 10;
        numeros[2] = 5;

        for (int i = 0; i<3; i++){
            System.out.println("O array na posicao "+i+" é "+ numeros[i]);
        }


    }
}
