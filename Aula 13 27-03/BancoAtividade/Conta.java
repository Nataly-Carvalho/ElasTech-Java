package BancoAtividade;

public class Conta {
    public static void main(String[] args) {
        ContaPoupanca contaP = new ContaPoupanca("Nataly",1234,300,13);
        contaP.sacar(200.00);
        contaP.depositar(50.00);
        contaP.calcularNovoSaldo(5);
        System.out.println("Nome Cliente "+ contaP.getCliente()+
                            "\nNumero da conta "+contaP.getNum_conta()+
                            "\nSaldo "+contaP.getSaldo());

        ContaEspecial contaE = new ContaEspecial("Nataly",1234,300,13);

    }
}
