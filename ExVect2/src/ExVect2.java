import java.util.Scanner;

import inquilinos.Inquilinos;

public class ExVect2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos quartos serão reservados:");
        int n = sc.nextInt();
        
        Inquilinos[] vect = new Inquilinos[10];    

        for(int i=0; i<n; i++){
            System.out.println("Pessoa " + (i + 1));
            System.out.println("Nome:");
            String nome = sc.next();
            System.out.println("Email:");
            String email = sc.next();
            System.out.println("Número do quarto:");
            int quarto = sc.nextInt();
            vect[quarto] = new Inquilinos(nome, email, quarto);
        }
        
        for (Inquilinos g: vect){
            System.out.println("Reservado:");
            if(g != null){
            System.out.println(g);
            }
        }
        sc.close();
    }
}
