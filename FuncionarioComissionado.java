public class FuncionarioComissionado extends FuncionarioPadrao {
    private double totalVendas;
    private double percentualComissao;

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Double comissao() {
        Double comissao = (totalVendas * percentualComissao / 100);
        return comissao;
    }

    @Override
    public Double calcularSalarioFinal() {
        double salarioFinal = getSalarioBase() + comissao();
        return salarioFinal;
    }

    @Override
    public String mostrarDados() {
        return "Nome: " + getNome() + " | Matrícula: " + getMatricula() + " | Salário Fixo: R$" + getSalarioBase() + " | Comissão: R$" + comissao() + " | Salário final: R$" + calcularSalarioFinal();
    }
}