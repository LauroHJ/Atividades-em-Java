import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import funcionarios.Funcionarios;

public class ExList {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Funcionarios> list = new ArrayList<>();
        Funcionarios funcionario;

        
        System.out.println("Quantos funcionarios serão adicionados?");
        int n = sc.nextInt();
    
        for(int i=0; i<n; i++){
            System.out.println("\nId:");
            Integer id = sc.nextInt();

            System.out.println("Nome:");
            String nome = sc.next();
            
            System.out.println("Salario:");
            Double salario = sc.nextDouble();

            list.add(i, new Funcionarios(id, nome, salario));
        }
        
        System.out.println("Entre com o id do funcionario que irá receber o acrécimo de salário:");
        Integer id = sc.nextInt();

        funcionario = list.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
      

            if(funcionario != null ){          
                System.out.println("Uiiii");
                System.out.println("Entre com o percentual:");
                Double percent = sc.nextDouble();
                funcionario.acrescimo(percent);
                for(Funcionarios g: list){
                    System.out.println(g);
                }
            }
            else{
                System.out.println("Esse funcionario não existe!");
                
                for(Funcionarios g: list){
                    System.out.println(g);
                }

            }
        sc.close();
    }

}
