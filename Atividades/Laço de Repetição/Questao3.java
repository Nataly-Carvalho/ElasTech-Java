public class Questao3 {
    public static void main(String[] args){
        //3 - Desenvolva um algoritmo que calcule a soma dos números pares de 1 a 100.

        int soma =0;

        for(int i = 0; i<=100;i++){
            if (i %2 == 0){
                soma+=i;

            }
        }
        System.out.println("As somas dos numeros é: " + soma);
    }
}
