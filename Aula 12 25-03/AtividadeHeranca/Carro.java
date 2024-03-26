package AtividadeHeranca;

public class Carro extends Veiculo {
    private int numeroPortas;
    public int getNumeroPortas() {
        return numeroPortas;
    }
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
    public Carro(String marca, String modelo, String cor, int ano, int numeroPortas) {
        super(marca, modelo, cor, ano);
        this.numeroPortas = numeroPortas;
    }
    public void mostrarDados3(){
        super.mostrarDados();
        System.out.println("Numeros de Portas = " + numeroPortas);
    }
}
