package BancoAtividade;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupanca(String cliente, int num_conta, float saldo, int diaRendimento) {
        super(cliente, num_conta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxa) {
        float taxaResult = (taxa * getSaldo())/100;
        float novoSaldo = getSaldo() + taxaResult;
        setSaldo(novoSaldo);
        System.out.println("Novo Saldo = " + novoSaldo);

    }
}
