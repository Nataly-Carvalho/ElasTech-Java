import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        //1- Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias.
        // A média das médias.
        System.out.println("=======================Questão 1====================================");
        double numero1, numero2,numero3, media1;
        double numero4,numero5, numero6, media2, mediaGeral;
        numero1 = 8.0;
        numero2 = 7.0;
        numero3 = 9.0;
        numero4 = 4.0;
        numero5 = 5.0;
        numero6 = 6.0;

        media1 = (numero1 + numero2+ numero3)/ 3;
        media2 = (numero4 + numero5 + numero6)/3;
        mediaGeral = media1 + media2;

        System.out.println("A media de 8, 9 e 7 é: " + media1);
        System.out.println("Os A media de 4, 5 e 6 é: " + media2);
        System.out.println("A Soma das medias é: " + mediaGeral);
        System.out.println("E a media das medias é: " +  mediaGeral/2);
        //2 - Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
        System.out.println("===========================Questão 2================================");
        int numeroInt;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        numeroInt = scan.nextInt();
        System.out.println("O antecessor é: " + (numeroInt-1));
        System.out.println("O Sucessor é: "+ (numeroInt +1));

        //3 - Crie um codigo que contenha 3 operações matematicas de sua escolha.
        System.out.println("===========================Questão 3================================");
        int n1, n2, soma, multi, sub;
        System.out.println("Digite um numero inteiro:");
        n1 = scan.nextInt();
        System.out.println("Digite mais um numero inteiro:");
        n2 = scan.nextInt();

        soma = n1 + n2;
        System.out.println("O resultado da soma é: " + soma);

        sub = n1 - n2;
        System.out.println("O resultado da subtração é: " + sub);

        multi = n1 * n2;
        System.out.println("O resultado a multiplicação é: " + multi);
        //4 - Desenvolva um codigo que solicite ao usuario seu Nome, Sobrenome, Idade, Endereço e ao final mostre todos os dados informados
        System.out.println("===========================Questão 4================================");

        String nome, sobrenome, endereco;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = scan.next();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = scan.next();
        System.out.println("Digite sua idade:");
        idade = scan.nextInt();
        System.out.println("Digite seu endereço:");
        endereco = scan.next();
        System.out.println("Seu nome é "+ nome + " "+ sobrenome+ " Sua idade é: " + idade+ " e voce mora em " + endereco);

        //5 - Crie um algoritmo que cadastra o nome e a idade de um usuario, após o cadastro mostre em que ano esse usuario nasceu.
        System.out.println("===========================Questão 5================================");
        String nomeUsuario;
        int idadeUsuario, anoNascimento, anoAtual;

        anoAtual = 2024;

        System.out.println("Digite seu nome: ");
        nomeUsuario = scan.next();

        System.out.println("Digite sua idade:");
        idadeUsuario = scan.nextInt();

        anoNascimento = anoAtual - idadeUsuario;

        System.out.println("O usuário " + nomeUsuario + " nasceu no ano de " + anoNascimento + ".");

        System.out.println("===========================================================");

    }
}
