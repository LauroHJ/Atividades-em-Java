package entities;

public class ImportedProduct extends Product {
    
    private Double customsFee;

    public ImportedProduct() {
        super();
    }
    public ImportedProduct(String name, Double price, Double customsFree) {
        super(name, price);
        this.customsFee = customsFree;
    }

    public Double getCustomsFree() {
        return customsFee;
    }
    public void setCustomsFree(Double customsFree) {
        this.customsFee = customsFree;
    }

    @Override
    public String toString() {
        return "Produto= " + this.name + ", preço= R$" + String.format("%.2f ", this.price) + "(custo de importação= R$"+ String.format("%.2f", this.customsFee) + ")";
    }
}