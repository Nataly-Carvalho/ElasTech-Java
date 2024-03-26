package AtividadeHeranca;



public class Moto extends Veiculo{

    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Moto(String marca, String modelo, String cor, int ano, int cilindradas) {
        super(marca, modelo, cor, ano);
        this.cilindradas = cilindradas;
    }

    public void mostrarDados2() {
        super.mostrarDados();
        System.out.println("Cilindradas = " + cilindradas);
    }
}
