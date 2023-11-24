package entities;

public class RoupaPMG implements Item {
    // atributos
    protected String descricao;
    protected int quantidadeP;
    protected int quantidadeM;
    protected int quantidadeG;
    protected int estoqueMinimo;
    protected int estoqueMaximo;

    // construtor
    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo,
            int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public void venda() {
    }
    
}
