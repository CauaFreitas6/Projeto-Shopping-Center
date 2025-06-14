public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, 0);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() { return taxaComercializacao; }
    public void setTaxaComercializacao(double taxaComercializacao) { this.taxaComercializacao = taxaComercializacao; }

    @Override
    public String toString() {
        return super.toString() + ", Taxa de Comercialização: " + taxaComercializacao;
    }
}