/*2) Escreva em Java uma classe Continente. Um continente possui um nome e é composto
por um conjunto de países. Forneça os membros de classe a seguir:

a) Construtor que inicialize o nome do continente;
b) Um método que permita adicionar países aos continentes;
c) Um método que retorne a dimensão total do continente;
d) Um método que retorne a população total do continente;
e) Um método que retorne a densidade populacional do continente;
f) Um método que retorne o país com maior população no continente;
g) Um método que retorne o país com menor população no continente;
h) Um método que retorne o país de maior dimensão territorial no continente;
i) Um método que retorne o país de menor dimensão territorial no continente;
j) Um método que retorne a razão territorial do maior pais em relação ao menor país.*/

public class Main {
    public static void main(String[] args) {

        Pais china = new Pais("China", 9.5967, 1439);
        Pais india = new Pais("India", 9.596, 14399);
        Pais japao = new Pais("Japão", 9.5, 14);
        //adicionando paises
        Continente asia = new Continente("Asia");
        asia.adicionarPais(china);
        asia.adicionarPais(india);
        asia.adicionarPais(japao);
        System.out.println("------------Lista Paises---------------");
        asia.listarPaises();
        //asia.removerPais(india);
        //System.out.println("-----------Revover pais------------------");
        //asia.listarPaises();
        System.out.println("----------------------------------------------");
        System.out.println("Dimensão total do continente: " + asia.dimensaoTotal());
        System.out.println("----------------------------------------------");
        System.out.println("População total do continente: " + asia.populacaoTotal());
        System.out.println("----------------------------------------------");
        System.out.println("Densidade populacional do continente: " + asia.densidadePopulacional());
        System.out.println("----------------------------------------------");
        System.out.println("País com maior população: " + asia.paisComMaiorPopulacao().getNome());
        System.out.println("----------------------------------------------");
        System.out.println("País com menor população: " + asia.paisComMenorPopulacao().getNome());
        System.out.println("----------------------------------------------");
        System.out.println("País de maior dimensão territorial: " + asia.paisMaiorDimensaoTerritorial().getNome());
        System.out.println("----------------------------------------------");
        System.out.println("País de menor dimensão territorial: " + asia.paisMenorDimensaoTerritorial().getNome());
        System.out.println("----------------------------------------------");
        System.out.println("Razão territorial do maior país em relação ao menor: " + asia.razaoTerritorial());

    }
}