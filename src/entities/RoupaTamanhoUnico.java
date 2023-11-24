package entities;

public class RoupaTamanhoUnico extends Peca implements Item{

    // construtor
    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        if(this.quantidade > 0) {
            this.quantidade --;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Quantidade insuficiente no estoque");
        }
    }
    
}
