import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class hashSet1 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        TreeSet<String> nomes = new TreeSet<>();

        nomes.add("Rafael");
        nomes.add("Ludmila");
        nomes.add("Anna Paula");

        System.out.println("Nomes" + nomes);
    }
}
