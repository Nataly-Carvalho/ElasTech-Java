import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("==========Cadastro============");
        System.out.println("Olá usuario, qual a sua idade? ");
        int idade = scan.nextInt();

        System.out.println("Qual o seu nome? ");
        String nome;
        scan.skip("\\R?");
        nome = scan.nextLine();

        System.out.println("Qual a sua altura?: ");
        float altura = scan.nextFloat();

        System.out.println("wow! " + nome + "Sua idade é " + idade + " e sua altura é " + altura);

        /*
        * Antes do comando de entrada de dados da variável String nome,
        *  observe que foi executado o Método skip("\R?").
        * O Método skip() ignora a entrada que corresponde ao padrão especificado dentro dos parênteses,
        * ignorando os delimitadores. Em nosso exemplo, como foi executada a leitura de dados de
        * variáveis de outros formatos (diferentes de String), antes de ler uma valor para a variável String,
        *  ao pressionar a tecla enter para finalizar a leitura, uma nova linha é gerada no console e o cursor foi movimentado
        * para o inicio desta linha através do caractere de escape \r (retorno do carro).
        *
        * Com o Método skip estamos ignorando o caractere de escape \r e desta forma o comando nextLine()
        * conseguirá efetuar a leitura via teclado de uma nova String.
        * Se você não executar o Método skip() antes da leitura do valor via teclado,
        * a Classe Scanner receberá o \r como o conteúdo da variável e como se trata de um caractere de escape,
        *  a variável frase ficará vazia (sem valor) e na sequência, fará a leitura do valor da próxima variável.*/


    }

}