package Heranca;
public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void mostrarDados() {
        System.out.println("Nome = " + nome);
        System.out.println("Idade = " + idade);
        System.out.println(" = " + endereco.getRua() + " = " + endereco.getCidade() + " = " + endereco.getEstado());
    }
}
