import java.util.Scanner;

public class ExMathTres {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = 0, a = 0, g = 0, d = 0;


        System.out.println("Olá, com qual combustível deseja abastecer hoje?");
        do{
            System.out.println("\nAlcool: 1\nGasolina: 2\nDiesel: 3\nSair: 4");
            x = sc.nextInt();
            switch(x){
                case 1:
                System.out.println("Alcool");
                a += 1;
                break;

                case 2:
                System.out.println("Gasolina");
                g += 1;
                break;

                case 3: 
                System.out.println("Diesel");
                d += 1;
                break;

                default:
                System.out.println("Escolha um valor válido");
                break;
            }
        }while(x != 4);

            System.out.println("Muito obrigado pela preferencia, segue abaixo a quantidade de clientes que abasteceram cada tipo de combustível:\nAlcool:"+ a +"\nGasolina:"+ g +"\nDiesel:"+ d);

        sc.close();
    }
}
