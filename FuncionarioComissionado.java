public class FuncionarioComissionado extends FuncionarioPadrao {
    private double totalVendas;
    private double percentualComissao;

    public FuncionarioComissionado(String nome, int matricula, double percentual, double totalVendas) {
        super(nome, matricula);
        this.percentualComissao = percentual;
        this.totalVendas = totalVendas;
    }

    public Double Comissao() {
        ;
        return totalVendas * percentualComissao / 100;
    }

    @Override
    public Double calcularSalarioFinal() {
        double salarioFinal = getSalarioBase() + Comissao();
        return salarioFinal;
    }

    @Override
    public String mostrarDados() {
        //return "\uD83D\uDC64 Nome: " + getNome() + " | \uD83D\uDCC4 Matrícula: " + getMatricula() + " | \uD83D\uDCB0 Salário Fixo: R$" + getSalarioBase() + " | \uD83D\uDCC8 Comissão: R$" + comissao() + " | \uD83D\uDCB5 Salário final: R$" + calcularSalarioFinal();
        return String.format("%-30s %-20s %-30s %-30s %-30s", "\uD83D\uDC64 Nome: " + getNome(), " | \uD83D\uDCC4 Matrícula: " + getMatricula(), " | \uD83D\uDCB0 Salário Fixo: R$" + getSalarioBase(), " | \uD83D\uDCC8 Comissão: R$" + Comissao(), " | \uD83D\uDCB5 Salário final: R$" + calcularSalarioFinal());
    }

}
