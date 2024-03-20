public class Main {

    public static void mensagemInicial(){
        System.out.println("Bem vindo ao sistema");
    }

    public static void mensagemUsusario(String nome){
        System.out.println("Bem vindo "+nome);
    }

    public static int somar(int numero1 , int numero2){
        return numero1 + numero2;
    }

    public static void main(String[]agr){
        mensagemInicial();
        mensagemUsusario("Nataly");


        System.out.println(somar(10,10));
        int n1 = 5, n2 = 9;
        System.out.println(somar(n1,n2));
    }
}
