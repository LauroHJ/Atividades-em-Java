import java.util.Scanner;
import java.util.Locale; 
import funcionario.Funcionario;

public class ExPoo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        Funcionario funcionario = new Funcionario();

        System.out.println("Olá, digite os dados para calcular seu salário líquido\n");
        System.out.print("Nome:");
        funcionario.nome = sc.nextLine();

        System.out.print("Salario bruto:");
        funcionario.salBruto = sc.nextDouble();

        System.out.print("Impostos:");
        funcionario.tax = sc.nextDouble();
        
        System.out.println("\n" + funcionario + "\n");

        System.out.printf("Funcionario: " + funcionario.nome + ", salário líquido: R$ %.2f", funcionario.liqSal());

        System.out.println("\nQual o percentual deverá ser adicionado ao salário?");
        funcionario.percent = sc.nextDouble();
        
        System.out.printf("\nDados atualizados: " + funcionario.nome + ", salário líquido: R$ %.2f", funcionario.incSal(null));
        System.out.println();
        sc.close();
    }
}
