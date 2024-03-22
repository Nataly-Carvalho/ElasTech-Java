package POOParte2.ContaBancaria;

public class ContaBancaria {
    private String nome;
    public int saldo = 0;
    public void depositar(int valor){
        saldo += valor;
        System.out.println("Voce depositou o valor de "+ valor);
    }
    public void setSaldo(int valor){
        if (valor > 0 ){
            saldo = valor;
        }else{
            System.out.println("O valor deve ser maior que 0");
        }


    }
    public int getSaldo(){
        return saldo;
    }
    public  void sacar(int valor){
        saldo -= valor;
        System.out.println("Voce sacou o valor de "+ valor);
    }
    public  void saldo(){
        System.out.println("seu saldo atual é "+ saldo);
    }




}
