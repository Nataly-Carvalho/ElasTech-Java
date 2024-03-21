package POOParte1;

public class Animal {
    //atributos
    String nome;
    int idade;

    public Animal(String nome , int idade){
        this.nome = nome;
        this.idade =idade;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void aniversario(){
        idade++;
    }
    public void inserir(){
        System.out.println("Inserido no banco de dados");
    }

}
