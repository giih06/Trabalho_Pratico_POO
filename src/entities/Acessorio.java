package entities;

public class Acessorio extends Peca implements Item{
    // construtor
    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }


    @Override
    public void venda() {

    }
}
