public class FuncionarioComissionado extends FuncionarioPadrao {
    private double totalVendas;
    private double percentualComissao;

    public FuncionarioComissionado(String nome, int matricula, double totalVendas, double percentualComissao) {
        super(nome, matricula);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    public double getTotalVenda() {
        return totalVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public Double comissao() {
        return totalVendas * percentualComissao / 100;
    }

    @Override
    public Double calcularSalarioFinal() {
        double salarioFinal = getSalarioBase() + comissao();
        return salarioFinal;
    }

    @Override
    public String mostrarDados() {
        return String.format("%-30s %-20s %-30s %-30s %-30s", "\uD83D\uDC64 Nome: " + getNome(),
                " | \uD83D\uDCC4 Matrícula: " + getMatricula(), " | \uD83D\uDCB0 Salário Fixo: R$" + getSalarioBase(),
                " | \uD83D\uDCC8 Comissão: R$" + comissao(),
                " | \uD83D\uDCB5 Salário final: R$" + calcularSalarioFinal());
    }

}
