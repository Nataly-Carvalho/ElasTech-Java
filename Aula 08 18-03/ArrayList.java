import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList<String> listaDeNomes = new ArrayList<>();

        listaDeNomes.add("Rafael");
        listaDeNomes.add("Jessika");
        listaDeNomes.add("Erica");


        System.out.println("Lista de nomes " + listaDeNomes);


        //Acessando o elemento por indice
        String nome1 = listaDeNomes.get(0);
        System.out.println("Primeiro Elemento "+ nome1);


        //Mostrando array inteiro
        System.out.println("Mostrando todos os elementos");
        for (String nome : listaDeNomes){
            System.out.println(nome);
        }


        //Remover um elemtno
        listaDeNomes.remove(2);


        //Mostrando novamente
        System.out.println("Mostrando com elementro excluido");
        for (String nome : listaDeNomes){
            System.out.println(nome);
        }


    }
}
