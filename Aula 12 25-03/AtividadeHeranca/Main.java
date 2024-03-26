package AtividadeHeranca;

/*Suponha que você esteja criando um sistema para gerenciar diferentes tipos de veículos.
Você pode ter uma classe básica chamada Veiculo e, em seguida, classes específicas que herdam dela, como Carro e Moto.
Cada classe pode ter seus próprios métodos e atributos, além de herdar aqueles da classe Veiculo.

classe veiculo
- Atributos
marca
modelo

classe Carro
- Atributos
numero_portas
cor
ano

classe Moto
cilindradas
cor
ano*/

public class Main {
    public static void main(String[] args) {
        Moto moto1 = new Moto("Marca","modelo","Azul", 2019,123);
        moto1.mostrarDados2();

        System.out.println("======================");
        Carro carro = new Carro("Marca","modelo", "vermelho", 2028,4);
        carro.mostrarDados3();
    }

}
