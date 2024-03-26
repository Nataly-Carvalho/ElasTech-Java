package Heranca;
public class Main {
    public static void main(String[] args) {
        Endereco ep1 = new Endereco("rua teste", "cidad teste", "estado teste");
        Pessoa p1 = new Pessoa("Rafael", 30, ep1);
        p1.mostrarDados();


        Estudante e1 = new Estudante("Rafael estudante", 32, 321321312);
        e1.mostrarDados2();
    }
}

