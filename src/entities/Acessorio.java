package entities;

import java.util.Scanner;

public class Acessorio extends Peca {
    // construtor
    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }


    @Override
    public void venda() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade vendida do " + getDescricao() + ": ");
        int quantidadeVendida = sc.nextInt();
        setQuantidade(getQuantidade() - quantidadeVendida);
        System.out.println("Venda realizada com sucesso!");
    }
}
