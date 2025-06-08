public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int capacidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeLojas];
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }
    public Loja[] getLojas() { return lojas; }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int count = 0;
        switch (tipoLoja) {
            case "Cosmético":
                for (Loja loja : lojas) {
                    if (loja instanceof Cosmetico) count++;
                }
                break;
            case "Vestuário":
                for (Loja loja : lojas) {
                    if (loja instanceof Vestuario) count++;
                }
                break;
            case "Bijuteria":
                for (Loja loja : lojas) {
                    if (loja instanceof Bijuteria) count++;
                }
                break;
            case "Alimentação":
                for (Loja loja : lojas) {
                    if (loja instanceof Alimentacao) count++;
                }
                break;
            case "Informática":
                for (Loja loja : lojas) {
                    if (loja instanceof Informatica) count++;
                }
                break;
            default:
                return -1;
        }
        return count;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica maisCaro = null;
        double maiorSeguro = -1;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (informatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = informatica.getSeguroEletronicos();
                    maisCaro = informatica;
                }
            }
        }
        return maisCaro;
    }

    public String toString() {
        return "Shopping: " + nome + ", Endereço: " + endereco + ", Lojas: " + lojas.length;
    }
}