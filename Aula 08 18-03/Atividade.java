import java.util.ArrayList;
import java.util.Scanner;

public class Atividade {

    /*Você foi contratado para desenvolver um programa que irá gerenciar uma lista
    de tarefas diárias de um usuário. O programa deve permitir ao usuário adicionar novas tarefas,
    remover tarefas existentes, listar todas as tarefas pendentes.

1 - O programa deve usar um array para armazenar as tarefas do usuário.
2 - O usuário deve ser capaz de adicionar uma nova tarefa à lista
3 - O usuário deve ser capaz de remover uma tarefa existente da lista.
4 - O programa deve exibir todas as tarefas na lista
Crie um Menu para o usuário escolher a opção desejada e ele
quando realizar a operação o sistema deve retornar ao menu principal*/
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String continuar = "";
        ArrayList<String> listaTarefas = new ArrayList<>();

        do{

            System.out.println("====================================");
            System.out.println("========Lista De Tarefas============");
            System.out.println("===Digite 1 para adicionar tarefa===");
            System.out.println("==Digite 2 para remover uma tarefa==");
            System.out.println("=Digite 3 para ver lista de tarefas=");
            System.out.println("==========Digite 0 para sair========");
            System.out.println("====================================");
            int op = scan.nextInt();
            String loop;

            switch (op){
                case 1:


                    System.out.println("Deseja voltar ao menu? ");
                    loop = scan.next();
                    if (loop.equalsIgnoreCase("S")){
                        continue;
                    }else {
                        continuar= "sair";
                    }
                    break;

                case 2:
                    System.out.println("Exclua uma tarefa");
                    for(int i = 0; i<listaTarefas.size(); i++){
                        System.out.println("Indice: "+ (i+1)+ " Tarefa "+listaTarefas.get(i));
                    }
                    System.out.println("Digite o numero da tarefa que deseja apagar");
                    int apagar = scan.nextInt();
                    listaTarefas.remove((apagar-1));
                    System.out.println("Tarefa Removida com Sucesso!");

                    System.out.println("Deseja voltar ao menu? ");
                    loop = scan.next();

                    if (loop.equalsIgnoreCase("S")){
                        continue;
                    }else {
                        continuar= "sair";
                    }
                    break;
                case 3:
                        if (listaTarefas.isEmpty()){
                            System.out.println("Não tem itens na lista");
                        }else {
                            System.out.println("===== Lista de Tarefas =====");
                            for (String tarefa : listaTarefas) {
                                System.out.println("- " + tarefa);
                            }
                        }

                    System.out.println("Deseja voltar ao menu? Digite -S- se deseja continuar ou -N- para sair " );
                    loop = scan.next();
                    if (loop.equalsIgnoreCase("S")){
                        continue;
                    }else {
                        continuar= "sair";
                    }
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
