public class FuncionarioPadrao {
    private String nome;
    private Integer matricula;

    private double SalarioBase = 2000.0;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public Integer getMatricula() {return matricula;}

    public double getSalarioBase() {return SalarioBase;}

    public Double Calcular() {
        return SalarioBase;
    }
}
