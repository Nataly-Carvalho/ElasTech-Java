package BancoAtividade;

public class ContaEspecial extends ContaBancaria {
    private float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(Double valor) {
        double saldo = getSaldo();
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Valor sacado " + valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }
}
