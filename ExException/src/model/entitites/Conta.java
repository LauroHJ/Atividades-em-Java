package model.entitites;

import model.exceptions.DomainException;

public class Conta {
    
    private Integer numero;
    private String titular;
    private Double corrente;
    private Double limite;
    
    public Conta() {
    }
    public Conta(Integer numero, String titular, Double corrente, Double limite) {
        this.numero = numero;
        this.titular = titular;
        this.corrente = corrente;
        this.limite = limite;
    }
    
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Double getCorrente() {
        return corrente;
    }
    public void setCorrente(Double corrente) {
        this.corrente = corrente;
    }
    public Double getLimite() {
        return limite;
    }
    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void deposito(Double valor){
        this.corrente += valor; 
    }

    public void saque(Double valor) throws DomainException{
        if (valor > this.corrente || valor > this.limite) {
            throw new DomainException("Esse valor é invado para sua conta");
        }
        else{
            this.corrente -= valor;
        }
    }
    
    @Override
    public String toString() {
        return this.numero + ", " + this.titular + ",\nConta corrente " + String.format("R$ %.2f", this.corrente) + ", Limite de saque: " + String.format("R$ %.2f", this.limite);
                
    }
    
    
    
}
