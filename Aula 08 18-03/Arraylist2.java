import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList nomes = new ArrayList<>();
        String nome = "teste";
        System.out.println("Digite nomes e siar pra finalizar");

        /*
        while (!nome.equals("sair")){
            System.out.println("Digite o nome");
            nome = scan.next();
            nomes.add(nome);
        }
        */


        while (true){
            System.out.println("digite o nome");
            nome = scan.next();
            if(nome.equalsIgnoreCase("sair")){
                break;
            }
            nomes.add(nome);
        }

        String procurarNome = "Rafael";
        if (nomes.contains(procurarNome)){
            System.out.println("sim o nome existe");
        }else {
        System.out.println("O nome não existe");
        }

        //nome.toLowerCase();  deixa em minusculo
        // nome.toUpperCase(); deixa em maiusculo

    }
}
