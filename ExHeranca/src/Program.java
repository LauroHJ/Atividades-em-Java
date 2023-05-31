import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o número de produtos:");
        int n = sc.nextInt();

        for (int y=1; y<=n; y++){
            System.out.println("Dados do "+y+"º produto");
            System.out.print("Comum, usado e importado (c/u/i)?");
            char x = sc.next().charAt(0); 
            System.out.print("Nome:");
            String name = sc.next();
            System.out.print("Preço:");
            Double price = sc.nextDouble();
            if(x == 'i'){
                Up to 4.3GHzstomsFee));
            }
            if(x == 'u'){
                System.out.print("Data de fabricação:");
                Date manufactureDate = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, manufactureDate));
            }
            else{
                list.add(new Product(name, price));
            }
        }
        System.out.println("Etiquetas");
        for (Product x: list){
            System.out.println(x);
        }

        sc.close();
    }
}
