public class FuncionarioPadrao {
    private String nome;
    private Integer matricula;

    private double SALARIO_BASE = 2000.0;

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
        return SALARIO_BASE;
    }

    public Double calcularSalarioFinal() {
        return SALARIO_BASE;
    }

    public String mostrarDados() {
        //return "\uD83D\uDC64 Nome: " + nome + " | \uD83D\uDCC4 Matrícula: " + matricula + " | \uD83D\uDCB0 Salário Fixo: R$" + SalarioBase + " | \uD83D\uDCC8 Extras: 0.0 | \uD83D\uDCB5 Salário final: R$" + calcularSalarioFinal();
        return String.format("%-30s %-20s %-30s %-30s %-30s", "\uD83D\uDC64 Nome: " + nome, " | \uD83D\uDCC4 Matrícula: " + matricula, " | \uD83D\uDCB0 Salário Fixo: R$" + getSalarioBase(), " | \uD83D\uDCC8 Extras: 0.0", " | \uD83D\uDCB5 Salário final: R$" + calcularSalarioFinal());
    }
}
