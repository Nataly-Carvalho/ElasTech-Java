package BancoAtividade;

public class ContaBancaria {
    private String cliente;
    private int num_conta;
    private float saldo;


    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void sacar(Double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saque maior que o da conta");
        }

        /*if(valor>saldo){
        System.out.println("O valor de saque não pode ser maior que saldo da conta");
        }else{
        saldo-=valor;
         System.out.println("Valor de saque" +valor+"Saldo atualizado" +saldo");

        }*/

    }

    public void depositar(Double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Deposito de " + valor + "\nNovo saldo " + saldo);

        } else {
            System.out.println("Valor invalido");
        }
    }
}
