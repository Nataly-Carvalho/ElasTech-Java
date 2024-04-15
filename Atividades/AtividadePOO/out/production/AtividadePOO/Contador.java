public class Contador {

    private int contador;

    public Contador(int contador) {
        this.contador = contador;
    }
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    public void zerar(){
        this.contador = 0;
    }
    public void incremento(){
        contador++;
    }

}
