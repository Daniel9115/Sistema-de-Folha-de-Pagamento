public class FuncionarioComissionado extends FuncionarioPadrao {
    private double totalVendas;
    private double percentualComissao;

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
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
        //return "\uD83D\uDC64 Nome: " + getNome() + " | \uD83D\uDCC4 Matrícula: " + getMatricula() + " | \uD83D\uDCB0 Salário Fixo: R$" + getSalarioBase() + " | \uD83D\uDCC8 Comissão: R$" + comissao() + " | \uD83D\uDCB5 Salário final: R$" + calcularSalarioFinal();
        return String.format("%-30s %-20s %-30s %-30s %-30s", "\uD83D\uDC64 Nome: " + getNome(), " | \uD83D\uDCC4 Matrícula: " + getMatricula(), " | \uD83D\uDCB0 Salário Fixo: R$" + getSalarioBase(), " | \uD83D\uDCC8 Comissão: R$" + comissao(), " | \uD83D\uDCB5 Salário final: R$" + calcularSalarioFinal());
    }

}
