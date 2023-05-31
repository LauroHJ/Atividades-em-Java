package entities;

public class PessoaJuridica extends Pessoa{

    private Integer nFuncionarios;
    
    public PessoaJuridica() {
        super();
    }
    public PessoaJuridica(String nome, Double rendaAnual, Integer nFuncionarios) {
        super(nome, rendaAnual);
        this.nFuncionarios = nFuncionarios;
    }

    public Integer getnFuncionarios() {
        return nFuncionarios;
    }
    public void setnFuncionarios(Integer nFuncionarios) {
        this.nFuncionarios = nFuncionarios;
    }
    
    @Override
    public Double impostoRenda() {
        Double imposto = 0.0;
        if(nFuncionarios <= 10){
            imposto = rendaAnual * 0.16;
        }
        else{
            imposto = rendaAnual * 0.14;
        } 
        return imposto;
    }
}
