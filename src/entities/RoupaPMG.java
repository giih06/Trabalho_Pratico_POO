package entities;

import java.util.Scanner;

public class RoupaPMG extends Peca {
    // atributos
    protected int quantidadeP;
    protected int quantidadeM;
    protected int quantidadeG;

    // construtor
    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidadeG, estoqueMinimo, estoqueMaximo);
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
    }

    @Override
    public void venda() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho P, M ou G de " + getDescricao() + ": ");
        String tamanho = sc.next().toUpperCase();
        sc.nextLine();
        if (tamanho.equals("P")) {
            this.quantidadeP--;
        } else if (tamanho.equals("M")) {
            this.quantidadeM--;
        } else if (tamanho.equals("G")) {
            this.quantidadeG--;
        } else {
            System.out.println("Tamanho inválido.");
            return;
        }
        setQuantidade(this.quantidadeP + this.quantidadeM + this.quantidadeG);
        System.out.println("Venda realizada com sucesso");
    }

    @Override
    public void reposicaoEstoque() {
        if (this.quantidadeP < this.estoqueMinimo) {
            this.quantidadeP = this.estoqueMinimo;
        } else if (this.quantidadeM < this.estoqueMinimo) {
            this.quantidadeM = this.estoqueMinimo;
        } else if (this.quantidadeG < this.estoqueMinimo) {
            this.quantidadeG = this.estoqueMinimo;
        }
    }
}
