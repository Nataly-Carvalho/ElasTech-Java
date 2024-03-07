public class Operacoes {
    public static void main(String[] args) {

        System.out.println("=======================Operadores=========================");
        int n1, n2, soma, multi, sub, resto;
        double div;
        /*Precisão:
        float: É um tipo de dado de ponto flutuante de precisão simples.
        Ele usa 32 bits para representar números de ponto flutuante. Isso significa que ele pode representar
        números decimais com uma precisão limitada.
        double: É um tipo de dado de ponto flutuante de precisão dupla.
        Usa 64 bits para representar números de ponto flutuante,
        o que oferece uma precisão maior do que o float.*/

        n1 = 10;
        n2 = 15;

        // Realiza a soma e imprime o resultado
        soma = n1 + n2;
        System.out.println("O resultado da soma é: " + soma);

        // Realiza a subtração e imprime o resultado
        sub = n1 - n2;
        System.out.println("O resultado da subtração é: " + sub);

        // Realiza a multiplicação e imprime o resultado
        multi = n1 * n2;
        System.out.println("O resultado a multiplicação é: " + multi);

        // Realiza a divisão e imprime o resultado
        div = (double) n1 / n2;
        System.out.println("O resultado da divisão é: " + div);

        // Calcula o resto da divisão e imprime o resultado
        resto = n1 % n2;
        System.out.println("O resto da divisão é: " + resto);

        System.out.println("=======================Procedencia=========================");
        /*Ordem de procedencia matematica,
        Precedência:
            1° lugar: *, /, %
            2º lugar +, -
        */
        // Calcula o resultado de uma expressão com diferentes operadores
        int resultado = (((5 + 4) * 3) - 2);
        System.out.println("Primeiro exemplo " + resultado);

        System.out.println("======================Incremento==========================");
        int x = 8;

        // Realiza o pré-incremento de x e imprime o valor atualizado
        System.out.println("Incremento teste 1 " + ++x);
        System.out.println(x);

        // Realiza o pós-incremento de x e imprime o valor atualizado
        System.out.println("Incremento teste 2 " + x++);
        System.out.println(x);
        System.out.println("===========================================================");


    }
}
