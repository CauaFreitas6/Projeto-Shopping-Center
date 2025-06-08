public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, 0);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() { return seguroEletronicos; }
    public void setSeguroEletronicos(double seguroEletronicos) { this.seguroEletronicos = seguroEletronicos; }

    @Override
    public String toString() {
        return super.toString() + ", Seguro de Eletrônicos: " + seguroEletronicos;
    }
}