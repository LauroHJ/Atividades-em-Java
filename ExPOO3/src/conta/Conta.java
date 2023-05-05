package conta;

public class Conta {
    
    private int numero; 
    private String titular; 
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
    public Conta(int numero, String titular, double initsaldo) {
        this.numero = numero;
        this.titular = titular;
        deposito(initsaldo);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
    @Override
    public String toString() {
        return "Conta: " + this.numero + ", titular: " + this.titular + ", saldo: " + String.format("%.2f", this.saldo);
    }

    public double deposito(double x){
        saldo +=  x;
        return saldo;
    }
    
    public double saque(double x){
        saldo -=  x + 5;
        return saldo;
    }

}
