import java.util.Scanner;
import pessoas.Pessoas;

public class ExVect {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Olá! Por favor insira os dados abaixo\nDigite número de pessoas a serem registradas:");
        n = sc.nextInt();
        Pessoas[] vect = new Pessoas[n];
        
        for (int i=0; i<n; i++) {      
            int x = i + 1;  
            System.out.println("Gênero da " + x + "a pessoa");
            char genero = sc.next().charAt(0);
            System.out.println("Altura da " + x + "a pessoa");
            double altura = sc.nextDouble();
            vect[i] = new Pessoas(genero, altura);
        }
        
        for (Pessoas g: vect) {
            System.out.println(g);
        }
        
        int c = 0;
        int v = 0;
        double w = vect[0].getAltura();
        double z = vect[0].getAltura();

        for (int i=0; i<n; i++){
            
            if(vect[i].getAltura() > w){
                w = vect[i].getAltura();
            }

            if(vect[i].getAltura() < z){
                z = vect[i].getAltura();
            }

            if(vect[i].getGenero() == 'M'){
                c++;
            }
            
            if(vect[i].getGenero() == 'F'){
                v++;
            }
        }
        System.out.printf("Maior altura: %.2f\n", w);
        System.out.printf("Menor altura: %.2f\n", z);
        System.out.println("Número de homens:" + c);
        System.out.println("Número de mulheres:" + v);
        sc.close();
    }

}
