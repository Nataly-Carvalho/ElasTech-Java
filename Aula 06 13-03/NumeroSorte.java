import java.util.Scanner;
import java.util.Random;

public class NumeroSorte {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();
        int cont = 0, chances = 5;

        int palpite = 0, numerodasorte = random.nextInt(10) + 1;
        System.out.println("=========================================================");
        System.out.println("=============🎮Vamos iniciar o jogo 🎮===================");
        System.out.println("=🤖Você deve acertar o número que o robô está pensando🤖=");
        System.out.println("==========================================================");

        for (int i =5; i>0; i--){
            System.out.println("O jogo vai começar em "+ i+ " Segundos...✨");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        while (palpite != numerodasorte && cont < chances) {
            int chancesRestantes = chances - cont;
            System.out.println("Digite um número, você tem " + chancesRestantes + " chances restantes 😖");
            palpite = leitura.nextInt();

            if (palpite == numerodasorte) {
                System.out.println("🎉🎉🎉 Parabéns! Você acertou 🎉🎉🎉");
                cont++;
            } else {
                System.out.println("Tente novamente ❌");
                cont++;
                if (numerodasorte < palpite){
                    System.out.println("Digite um numero menor ⬇️");

                } else if (numerodasorte > palpite) {
                    System.out.println("Digite um numero maior ⬆️");

                }
            }
        }

        if (palpite != numerodasorte) {
            System.out.println("☠️☠️☠️ GAME OVER ☠️☠️☠️");
            System.out.println("Suas chances acabaram! O número era " + numerodasorte);
        }
    }
}
