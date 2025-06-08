public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = null;
    }

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public Data getDataValidade() { return dataValidade; }
    public void setDataValidade(Data dataValidade) { this.dataValidade = dataValidade; }

    public boolean estaVencido(Data dataAtual) {
        if (dataValidade == null) return false;
        if (dataValidade.getAno() < dataAtual.getAno()) return true;
        if (dataValidade.getAno() > dataAtual.getAno()) return false;
        if (dataValidade.getMes() < dataAtual.getMes()) return true;
        if (dataValidade.getMes() > dataAtual.getMes()) return false;
        return dataValidade.getDia() < dataAtual.getDia();
    }

    public String toString() {
        return "Produto: " + nome + ", Preço: " + preco + (dataValidade != null ? ", Validade: " + dataValidade : "");
    }
}