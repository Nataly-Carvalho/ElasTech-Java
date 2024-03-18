import java.util.ArrayList;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
    //10 - Desenvolva um programa que permita ao usuário inserir itens em uma lista de compras. O programa deve exibir
        // a lista de compras atualizada após cada inserção e perguntar se o usuário deseja adicionar mais itens.
        // O programa deve continuar executando até que o usuário decida sair.


        Scanner scan = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        int continuar;
        do {
            System.out.println("===================================");
            System.out.println("=========Lista de compras==========");
            System.out.println("===================================\n");
            System.out.println("Adicione um item a lista de compras");
            String item = scan.next();
            lista.add(item);

            System.out.println("Lista de compra atualizada com sucesso!");
            System.out.println("===================================");
            System.out.println(lista);
            System.out.println("===================================\n");

            System.out.println("Deseja Adicionar mais um item?: 1/sim ou 2/Não");
            continuar= scan.nextInt();
        }while (continuar == 1);
    }
}
