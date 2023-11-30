package entities;

public abstract class Peca implements Item {
    // atributos
    protected String descricao;
    protected int quantidade;
    protected int estoqueMinimo;
    protected int estoqueMaximo;

    // construtores
    public Peca() {
    }

    public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    // métodos

    public abstract void venda();

    public void reposicaoEstoque() {
        if(this.quantidade < this.estoqueMinimo) {
            this.quantidade = this.estoqueMaximo;
        }
    }

    // Getters e Setters

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }


    public int getEstoqueMaximo() {
        return estoqueMaximo;
    } 
}
