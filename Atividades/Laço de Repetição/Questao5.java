public class Questao5 {
    public static void main(String[] args){
    //5 - Implemente um algoritmo que exiba os primeiros 20 números da sequência de Fibonacci.

        int n = 20;

        int[] sequencia = new int[n];

        sequencia[0] = 1;
        sequencia[1] = 1;

        for(int i=2; i <n;i++){
            sequencia[i] = sequencia[i-1] + sequencia[i-2];
        }
        System.out.println("Os primeiros 20 números da sequência de Fibonacci são:");
        for (int i = 0; i<n; i++){
            System.out.println(sequencia[i]+ " ");
        }
    }

}
