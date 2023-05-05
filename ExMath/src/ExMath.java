import java.util.Scanner;

public class ExMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		Double A, B, C;
		Double Area;
		
		do {
			System.out.println("\nEscolha qual operação deseja realizar com os dados inseridos:\n Área de triângulo de base A e altura C: 1\n Área de círculo de raio C: 2\n Área de quadrado de lado B: 3\n Sair: 4\n");
			x = sc.nextInt();
			
			switch(x){
			
			case 1: 
				System.out.println("Insira os valores de A e C abaixo:");
				A = sc.nextDouble();
				C = sc.nextDouble();
				
				Area = (A*C)/2;
				
				System.out.printf("O resultado da operação: %.2f", Area);
	
				break;
			
			case 2:
				System.out.println("Insira os valores de C abaixo:");
				C = sc.nextDouble();
				
				Area = Math.PI*C*C;

				System.out.printf("O resultado da operação: %.2f", Area);

				
				break;
				
			case 3:
				System.out.println("Insira os valores de B abaixo:");
				B = sc.nextDouble();
	 			
				Area = B*B;
				
				System.out.printf("O resultado da operação: %.2f", Area);
	
				break;
			}
		 } while(x != 4);
		
		sc.close();

	}

}


 