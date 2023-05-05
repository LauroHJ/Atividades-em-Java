import java.util.Scanner;

public class ExMathQuatro {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x, y=0, z=0; 

        System.out.println("Escolha um número:");
        x = sc.nextInt();

            for(int i=1; i<=x; i++){
                
                y = i*i;
                z = y*i;
                
                System.out.printf("\n %d %d %d\n", i, y, z);
            }
        sc.close();
    }
}
