import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entitites.Conta;
import model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Conta conta;
        try{
            System.out.println("Insira os dados da conta abaixo");
            System.out.print("Número:");
            Integer numero = sc.nextInt();
            System.out.print("Títular:");
            String titular = sc.next();
            System.out.print("Saldo da conta corrente:");
            Double corrente = sc.nextDouble();
            System.out.print("Limite de saque:");
            Double limite = sc.nextDouble();
            Conta conta = new Conta(numero, titular, corrente, limite);

            int x;
            do{
            System.out.println("\nQual operação deseja realizar?\nDados da conta(0)\nDepósito(1)\nSaque(2)\nSair(3)\n");
            x = sc.nextInt();
                switch (x) {
                    case 0:
                        System.out.println(conta);

                        break;
                    case 1:
                        System.out.println("\nDeposito");
                        System.out.print("Valor que deseja depositar:");
                        Double valor = sc.nextDouble();
                        conta.deposito(valor);
                        System.out.print("Conta atualizada com sucesso:\n");
                        System.out.println(conta+"\n");

                        break;
                
                    case 2:
                        System.out.println("\nSaque");
                        System.out.print("Valor que deseja sacar:");
                        Double valor2 = sc.nextDouble();
                        conta.saque(valor2);
                        System.out.print("Conta atualizada com sucesso:\n");
                        System.out.println(conta+"\n");

                        break;
                }
            }while(x != 3);
        }
        catch (InputMismatchException e){
            System.out.println("Dados inválidos");
        }
        catch (DomainException e) {
            System.out.println("Erro:" + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Erro inesperado");
        }
        finally{
            sc.close();
            System.out.println("Obrigado pela preferência :)");
        } 
    }
}
