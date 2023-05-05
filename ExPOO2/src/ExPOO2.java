import java.util.Scanner;
import util.Cota;
import java.text.DecimalFormat;

public class ExPOO2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat ("#%");
    
    System.out.println("Olá! Seja bem vindo ao câmbio\nPor favor infome o valor atual do Dolar:");
    double price = sc.nextDouble();

    System.out.println("Por favor infome o valor que deseja comprar:");
    double dollars = sc.nextDouble();

    double p = Cota.pagamento(price, dollars);    

    System.out.printf("O Valor a pagar é de %.2f\n", p);
    System.out.println("Com o IOF calculado em " + df.format(Cota.IOF));
    
    sc.close();
    }
 
}
