package POOParte1;

public class Main {
    public static void main(String[] args) {
        //criar Atributos
        Animal animal = new Animal("Lucy",10);
        Animal animal2 = new Animal("Lili",10);
        //Mostar os atributos e metodos
        System.out.println("O nome do animal é "+ animal.getNome());
        System.out.println("A idade do animal é "+ animal.getIdade());
        animal.aniversario();
        System.out.println("A nova idade é "+ animal.getIdade());

        System.out.println("-----------------------------");
        System.out.println("O nome do animal é "+ animal2.getNome());
        System.out.println("A idade do animal é "+ animal2.getIdade());
        animal2.aniversario();
        System.out.println("A nova idade é "+ animal2.getIdade());

        System.out.println("-------------------------------");

        Animal animal3= new Animal("Jeka", 18);
        System.out.println("O nome do animal 3 é "+ animal3.getNome());
        animal3.inserir();



    }
}
