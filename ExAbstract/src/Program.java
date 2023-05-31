import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();
        Pessoa pessoa;
        
        System.out.print("Quantas pessoas deseja cadastrar?");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.print("Pessoa física ou jurídica (f/j)?");
            char y = sc.next().charAt(0);
            System.out.println("Insira os dados da "+i+"ª pessoa");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Renda anual: ");
            Double rendaAnual = sc.nextDouble();
            if(y == 'f'){
                System.out.print("Gastos com saúde: ");
                Double gastosSaude = sc.nextDouble();
                pessoa = new PessoaFisica(nome, rendaAnual, gastosSaude);
                list.add(pessoa);
            }
            else{
                System.out.print("Número de funcionarios: ");
                Integer nFuncionarios = sc.nextInt();
                pessoa = new PessoaJuridica(nome, rendaAnual, nFuncionarios);
                list.add(pessoa);
            }
        }
        
        System.out.println("Leão vai te pegar!");
        Double y = 0.0;
        for (Pessoa x: list){
            System.out.printf("Nome: " + x.getNome() +", Imposto a pagar: R$ %.2f\n", x.impostoRenda());
            y += x.impostoRenda();
        }
        System.out.printf("Valor total: R$ %.2f\n", y);


        sc.close();
    }
}