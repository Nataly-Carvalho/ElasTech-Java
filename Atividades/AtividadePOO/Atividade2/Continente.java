import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private ArrayList<Pais> paises = new ArrayList<>();


    public Continente(String nome ) {
        this.nome = nome;
        this.paises = paises;
    }

    public void adicionarPais(Pais pais){
        this.paises.add(pais);
    }
    public void removerPais(Pais pais){
        this.paises.remove(pais);
    }
    public void listarPaises(){
        for (Pais pais : paises) {
            System.out.println(pais.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double dimensaoTotal() {
        double total = 0;
        for (Pais pais : paises) {
            total += pais.getDimensaoTerritorio();
        }
        return total;
    }

    public int populacaoTotal() {
        int total = 0;
        for (Pais pais : paises) {
            total += pais.getPopulacao();
        }
        return total;
    }

    public double densidadePopulacional() {
        double totalTerritorio = dimensaoTotal();
        int totalPopulacao = populacaoTotal();
        return totalPopulacao / totalTerritorio;
    }

    public Pais paisComMaiorPopulacao() {
        Pais paisMaior = null;
        for (Pais pais : paises) {
            if (paisMaior == null || pais.getPopulacao() > paisMaior.getPopulacao()) {
                paisMaior = pais;
            }
        }
        return paisMaior;
    }

    public Pais paisComMenorPopulacao() {
        Pais paisMenor = null;
        for (Pais pais : paises) {
            if (paisMenor == null || pais.getPopulacao() < paisMenor.getPopulacao()) {
                paisMenor = pais;
            }
        }
        return paisMenor;
    }

    public Pais paisMaiorDimensaoTerritorial() {
        Pais paisMaior = null;
        for (Pais pais : paises) {
            if (paisMaior == null || pais.getDimensaoTerritorio() > paisMaior.getDimensaoTerritorio()) {
                paisMaior = pais;
            }
        }
        return paisMaior;
    }

    public Pais paisMenorDimensaoTerritorial() {
        Pais paisMenor = null;
        for (Pais pais : paises) {
            if (paisMenor == null || pais.getDimensaoTerritorio() < paisMenor.getDimensaoTerritorio()) {
                paisMenor = pais;
            }
        }
        return paisMenor;
    }

    public double razaoTerritorial() {
        Pais paisMaior = paisMaiorDimensaoTerritorial();
        Pais paisMenor = paisMenorDimensaoTerritorial();
        if (paisMaior != null && paisMenor != null) {
            return paisMaior.getDimensaoTerritorio() / paisMenor.getDimensaoTerritorio();
        }
        return 0;
    }
}
