public class Pais {

    private String nome;
    private double dimensaoTerritorio;
    private int populacao;

    public Pais(String nome, double dimensaoTerritorio, int populacao) {
        this.nome = nome;
        this.dimensaoTerritorio = dimensaoTerritorio;
        this.populacao = populacao;
    }
    public double getDimensaoTerritorio() {
        return dimensaoTerritorio;
    }
    public int getPopulacao() {
        return populacao;
    }
    public String getNome() {
        return nome;
    }

}
