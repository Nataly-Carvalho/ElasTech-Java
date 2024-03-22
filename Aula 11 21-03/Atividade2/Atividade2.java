package Atividade2;

public class Atividade2 {
    /*
    * 2 - A fim de representar colaboradores em uma firma, crie uma classe chamada Colaborador
    *  que inclui as três informações a seguir como atributos:
    um primeiro nome,  um sobrenome um salário mensal.
    Sua classe deve ter um construtor que inicializa os três atributos.
    Forneça um método set e get para cada atributo. Se o salário mensal não for positivo,
    configure-o como 0.0. Escreva um aplicativo de teste que demonstra as capacidades da classe.
    Crie duas instâncias da classe e exiba o salário anual de cada instância.
    Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada colaborador.*/

    public static void main(String[] args) {
    Colaborador colaborador = new Colaborador("Nataly","Carvalho", 100);
        System.out.println("Nome: " + colaborador.getNome());
        System.out.println("Sobrenome: " + colaborador.getSobrenome());
        System.out.println("Salario: " + colaborador.getSalario());
        System.out.println("Salario Anual: " + colaborador.salarioAnual());
        System.out.println("Aumento: "+ colaborador.ajusteSalario());
        System.out.println("Salario anual com aumento:  " + colaborador.salarioAnual());

        System.out.println("-------------------------------------------------------");
        Colaborador colaborador2 = new Colaborador("Maria","Caetano", 1000);
        System.out.println("Nome: " + colaborador2.getNome());
        System.out.println("Sobrenome: " + colaborador2.getSobrenome());
        System.out.println("Salario: " + colaborador2.getSalario());
        System.out.println("Salario Anual: " + colaborador2.salarioAnual());
        System.out.println("Aumento: "+ colaborador2.ajusteSalario());
        System.out.println("Salario anual com aumento: " + colaborador2.salarioAnual());

    }
}
