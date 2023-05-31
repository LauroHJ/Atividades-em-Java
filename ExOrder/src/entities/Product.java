package entities;

public class Product {
    
    private String ItemName;
    private Double price;
    
    public Product() {
    }
    public Product(String name, Double price) {
        this.ItemName = name;
        this.price = price;
    }
    
    public String getName() {
        return ItemName;
    }
    public void setName(String name) {
        this.ItemName = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return ItemName;
    }
    
    
}
