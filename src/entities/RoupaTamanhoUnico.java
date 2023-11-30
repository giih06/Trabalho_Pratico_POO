package entities;

public class RoupaTamanhoUnico extends Peca {

    // construtor
    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        if(getQuantidade() > 0) {
            setQuantidade(getQuantidade() - 1);
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Quantidade insuficiente no estoque");
        }
    }
    
}
