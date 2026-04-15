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

    public Integer getMatricula() {
        return matricula;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public Double calcularSalarioFinal() {
        return SalarioBase;
    }

    public String mostrarDados() {
        return "Nome: " + nome + " | Matrícula: " + matricula + " | Salário Fixo: R$" + SalarioBase + " | Extras: 0.0 | Salário final: R$" + calcularSalarioFinal();
    }
}
