public class FuncionarioProducao extends FuncionarioPadrao {
    private double valorPorPeca;
    private Integer quantidadeProduzida;

    public double getValorPorPeca() {
        return valorPorPeca;
    }

    public FuncionarioProducao(String nome, int matricula, double valorPorPeca, Integer quantidadeProduzida) {
        super(nome, matricula);
        this.valorPorPeca = valorPorPeca;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public Integer getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(Integer quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public double bonus() {
        return valorPorPeca * quantidadeProduzida;
    }

    @Override
    public Double calcularSalarioFinal() {
        return getSalarioBase() + bonus();
    }

    @Override
    public String mostrarDados() {
        //return "\uD83D\uDC64 Nome: " + getNome() + " | \uD83D\uDCC4 Matrícula: " + getMatricula() + " | \uD83D\uDCB0 Salário Fixo: R$" + getSalarioBase() + " | \uD83D\uDCC8 Produtividade: R$" + Bonus() + " | \uD83D\uDCB5 Salário final: R$" + calcularSalarioFinal();
        return String.format("%-30s %-20s %-30s %-30s %-30s", "\uD83D\uDC64 Nome: " + getNome(), " | \uD83D\uDCC4 Matrícula: " + getMatricula(), " | \uD83D\uDCB0 Salário Fixo: R$" + getSalarioBase(), " | \uD83D\uDCC8 Produtividade: R$" + bonus(), " | \uD83D\uDCB5 Salário final: R$" + calcularSalarioFinal());
    }
}


