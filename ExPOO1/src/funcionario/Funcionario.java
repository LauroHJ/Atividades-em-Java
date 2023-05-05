package funcionario;

public class Funcionario{

    public String nome;
    public double salBruto, tax, percent;

    public double liqSal(){
        return salBruto - tax; 
    }

    public double incSal(Double x){
        x = (percent/100) * salBruto;
        return (x + salBruto) - tax; 
    }

    public String toString(){
        return nome + ", R$" + String.format("%.2f",salBruto) + ", R$" + String.format("%.2f",tax);
    }
}
