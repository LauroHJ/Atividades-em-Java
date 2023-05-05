import java.util.Scanner;
import conta.Conta;

public class EXPOO3 {

    public static void main(String[] args) {
        char x;
        int y;
        Conta conta;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Olá, seja bem vindo, informe os dados abaixo:");
        
        System.out.println("Numero:");
        int numero = sc.nextInt();

        System.out.println("Nome:");
        String titular = sc.next();

        do{
        System.out.println("Deseja realizar algum depósito inicial?(y/n)");
        x = sc.next().charAt(0);
        
            if(x == 'y'){
                System.out.println("Depósito inicial:");
                Double initsaldo = sc.nextDouble();
                
                conta = new Conta(numero, titular, initsaldo);                
            }       
            else{
                conta = new Conta(numero, titular);                
            } 
        }while(x != 'y' && x != 'n');
            System.out.println(conta);
       
        do{
            System.out.println("\nDeseja realizar um depósito ou saque?\n1-depósito\n2-saque\n3-sair");
            y = sc.nextInt();
            switch(y){

                case 1: 
                System.out.println("Digite o valor do depósito:");
                double z = sc.nextDouble();
                conta.deposito(z);
                System.out.println(conta);

                break;

                case 2:
                System.out.println("Digite o valor do saque:");
                double w = sc.nextDouble();
                conta.saque(w); 
                System.out.println(conta);

                break;

                }
        }while(y != 3 );
        
        System.out.println("Obrigado pela preferência :) Volte sempre!"); 

        sc.close();
    }

}
