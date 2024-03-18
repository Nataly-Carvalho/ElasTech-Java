import java.util.Random;
import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args){
    //8 - Implemente um jogo no qual o programa escolhe um número aleatório entre 1 e 100,
    // e o jogador deve tentar adivinhá-lo. O programa deve fornecer dicas do tipo "maior" ou "menor" conforme necessário.
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int palpite = 0, numerodasorte = random.nextInt(100) + 1;
        System.out.println("=========================================================");
        System.out.println("=============🎮Vamos iniciar o jogo 🎮===================");
        System.out.println("=🤖Você deve acertar o número que o robô está pensando🤖=");
        System.out.println("==========================================================");

        while (palpite != numerodasorte) {
            System.out.print("Digite seu palpite: ");
            palpite = scan.nextInt();
            if (palpite == numerodasorte) {
                System.out.println("🎉🎉🎉 Parabéns! Você acertou 🎉🎉🎉");
            } else {
                System.out.println("Tente novamente ❌");
                if (numerodasorte < palpite){
                    System.out.println("Digite um numero menor ⬇️");

                } else if (numerodasorte > palpite) {
                    System.out.println("Digite um numero maior ⬆️");

                }
            }
        }
    }
}
