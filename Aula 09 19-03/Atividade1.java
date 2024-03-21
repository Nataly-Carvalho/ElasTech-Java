import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1 {
    static Scanner scan = new Scanner(System.in);
    static String continuar = "";
    static ArrayList<String> listaTarefas = new ArrayList<>();

    static void Menu(){
        System.out.println("====================================");
        System.out.println("========Lista De Tarefas============");
        System.out.println("===Digite 1 para adicionar tarefa===");
        System.out.println("==Digite 2 para remover uma tarefa==");
        System.out.println("=Digite 3 para ver lista de tarefas=");
        System.out.println("==========Digite 0 para sair========");
        System.out.println("====================================");
    }
    static void AdicionarItem(){
        scan.nextLine();
        System.out.print("Digite a nova tarefa: ");
        String itemLista = scan.nextLine();
        listaTarefas.add(itemLista);
    }

    static void RemoverItem(){
        System.out.println("Exclua uma tarefa");
        for(int i = 0; i<listaTarefas.size(); i++){
            System.out.println("Indice: "+ (i+1)+ " Tarefa "+listaTarefas.get(i));
        }
        if(listaTarefas.isEmpty()){
            System.out.println("--Não tem itens na lista--\n");
        }else {
            System.out.println("Digite o numero da tarefa que deseja apagar");
            int apagar = scan.nextInt();
            listaTarefas.remove((apagar - 1));
            System.out.println("Tarefa Removida com Sucesso!");
        }
    }
    static void VerLista(){
        if (listaTarefas.isEmpty()){
            System.out.println("Não tem itens na lista");
        }else {
            System.out.println("===== Lista de Tarefas =====");
            for (String tarefa : listaTarefas) {
                System.out.println("- " + tarefa);
            }
        }
    }

    static void continuarLoop(){
        System.out.println("Deseja voltar ao menu?\nDigite -S- se deseja continuar ou -N- para sair " );
        continuar = scan.next();
        if (continuar.equalsIgnoreCase("S")){
            continuar = "seguir";
        }else {
            continuar= "sair";
        }
    }
    public static void main(String[] args){
        do{
            Menu();
            int op = scan.nextInt();
            switch (op){
                case 1:
                    AdicionarItem();
                    continuarLoop();
                    break;
                case 2:
                    RemoverItem();
                    continuarLoop();
                    break;
                case 3:
                    VerLista();
                    continuarLoop();
                    break;
                case 0:
                    continuar = "sair";
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;

            }
        }while (!continuar.equalsIgnoreCase("sair"));

        }

    }
