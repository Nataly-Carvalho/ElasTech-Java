package Atividade1;

public class Suprimentos {

    private int id;
    private String DescricaoItem;
    private double precoUnitario;
    private int qtd;


    public Suprimentos(int id,String descricaoItem,int qtd, double precoUnitario) {
        this.id = id;
        this.DescricaoItem = descricaoItem;
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
        if (qtd > 0) {
            this.qtd = qtd;
        } else {
            this.qtd = 0;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricaoItem() {
        return DescricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        DescricaoItem = descricaoItem;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public double getInvoiceAmount(){
        return precoUnitario * (double) qtd;
    }

}
