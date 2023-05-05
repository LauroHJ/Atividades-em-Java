import java.util.Scanner;

public class ExMathDois{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         double renda, x;

        System.out.println("Olá cidadão Lisarbiano, seja bem vindo ao sistema de roubo estatal, esteja preparado para sofrer com a patata do leão.\nPor favor insira abaixo a sua renda mensal para calcularmos o rombo que causaremos na sua conta corrente."); 
        do{
            renda = sc.nextDouble();
            if(renda <= 2000 && renda != 0) {
                System.out.println("Parabéns cidadão Lisarbaino, esse ano sua conta corrente será poupada.");
                System.out.println("Escreva outro valor de renda ou tecle 0 caso queira sair");

            } else if(renda >= 2000.01 && renda <= 3000) {
                x = (renda-2000)*0.08;
                System.out.printf("Deverá pagar %.2f para o Leão se não vai de gulag!\n\n", x);
                System.out.println("Escreva outro valor de renda ou tecle 0 caso queira sair");

            } else if (renda >= 3000.01 && renda <= 4500) {
                x = ((renda-3000)*0.18) + 80;
                System.out.printf("Deverá pagar %.2f para o Leão se não vai de gulag!\n\n", x);
                System.out.println("Escreva outro valor de renda ou tecle 0 caso queira sair");

            } else if (renda > 4500) {
                x = ((renda-4500)*0.28) + 350;
                System.out.printf("Deverá pagar %.2f para o Leão se não vai de gulag!\n\n", x);
                System.out.println("Escreva outro valor de renda ou tecle 0 caso queira sair");

            }
        }while(renda != 0);
        
        System.out.println("Não se esqueça, o leão vai te pegar uma hora ou outra.");
        sc.close();
    }
}   