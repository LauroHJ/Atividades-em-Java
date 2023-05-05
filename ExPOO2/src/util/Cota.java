package util;

public class Cota {
    
    public static final double IOF = 0.06;

     public static double compra(double price, double dollars) {
        return price * dollars; 
    }

    public static double pagamento(double price, double dollars) {
        double x = price * dollars;
        return x + (x * IOF);
        
    }
}
