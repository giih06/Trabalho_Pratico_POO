package application;

import java.util.Scanner;

import entities.Acessorio;
import entities.Peca;
import entities.RoupaPMG;
import entities.RoupaTamanhoUnico;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Peca[] estoque = new Peca[5];
        estoque[0] = new Acessorio("Bermuda", 3, 1, 90);
        estoque[1] = new RoupaTamanhoUnico("Regata", 30, 10, 40);
        estoque[2] = new RoupaPMG("Biquini", 5, 4, 2, 5, 30);
        estoque[3] = new RoupaPMG("Sutiã", 7, 6, 8, 1, 29);
        estoque[4] = new Acessorio("Colar", 12, 3, 33);
        int opcao;
        while (true) {
            System.out.println("Escolha uma opção");
            for(int i=0; i<estoque.length; i++) {
                System.out.println(i + " - " + estoque[i].getDescricao());
            }
            System.out.println("5 - Sair do sistema");

            opcao = sc.nextInt();

            if (opcao >= 0 && opcao < estoque.length) {
                estoque[opcao].venda();
                estoque[opcao].reposicaoEstoque(); 
            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opção inválida, tente novamente");
            }
        }

        System.out.println("Estoque final");
        for(Peca peca : estoque) {
            System.out.println(peca.getDescricao() + ": " + peca.getQuantidade());
        }
        sc.close();
    }
}
