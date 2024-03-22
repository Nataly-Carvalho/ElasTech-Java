package POOParte2.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.saldo();
        conta.depositar(20);
        conta.sacar(10);
        conta.saldo();
        conta.depositar(30);
        conta.saldo();
    }

}
