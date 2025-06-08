public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;


    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.estoqueProdutos = new Produto[0];
    }


    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.estoqueProdutos = new Produto[0];
    }


    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this(nome, quantidadeFuncionarios);
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }


    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this(nome, quantidadeFuncionarios, salarioBaseFuncionario);
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }


    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int capacidadeEstoque) {
        this(nome, quantidadeFuncionarios);
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[capacidadeEstoque];
    }


    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoque) {
        this(nome, quantidadeFuncionarios, salarioBaseFuncionario);
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[capacidadeEstoque];
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getQuantidadeFuncionarios() { return quantidadeFuncionarios; }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) { this.quantidadeFuncionarios = quantidadeFuncionarios; }
    public double getSalarioBaseFuncionario() { return salarioBaseFuncionario; }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) { this.salarioBaseFuncionario = salarioBaseFuncionario; }
    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }
    public Data getDataFundacao() { return dataFundacao; }
    public void setDataFundacao(Data dataFundacao) { this.dataFundacao = dataFundacao; }
    public Produto[] getEstoqueProdutos() { return estoqueProdutos; }

    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) return -1;
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) return 'P';
        if (quantidadeFuncionarios <= 30) return 'M';
        return 'G';
    }

    public void imprimeProdutos() {
        for (Produto p : estoqueProdutos) {
            if (p != null) System.out.println(p);
        }
    }

    public boolean insereProduto(Produto p) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = p;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String result = "Loja: " + nome + ", Funcionários: " + quantidadeFuncionarios + ", Salário Base: " + salarioBaseFuncionario;
        if (endereco != null) result += ", Endereço: " + endereco;
        if (dataFundacao != null) result += ", Fundação: " + dataFundacao;
        result += ", Estoque: " + estoqueProdutos.length + " produtos";
        return result;
    }
}