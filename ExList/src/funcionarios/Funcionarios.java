package funcionarios;

public class Funcionarios {
    
    private Integer id;
    private String nome;
    private Double salario;
   
    public Funcionarios(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "funcionarios [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
    }

    public void acrescimo (double percent){
        this.salario +=(percent/100) * salario;
    }

}
