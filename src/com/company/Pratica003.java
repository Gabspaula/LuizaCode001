package com.company;

import java.util.Scanner;

public class Pratica003 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("CARDAPIO! \n" +
                "Cachorro quente  --  100  --  1.20 \n" +
                "Bauru simples    --  101  --  1.30 \n" +
                "Bauru com ovo    --  102  --  1.50 \n" +
                "Hamburguer       --  103  --  1.20 \n" +
                "Cheeseburguer    --  104  --  1.30 \n" +
                "Refrigerante     --  105  --  1.00 \n" +
                "Veganao          --  106  --  1.10 \n");

        System.out.print("Digite o codigo do item desejado: ");
        int codigo = leia.nextInt();

        System.out.print("Digite a quantidade desejada: ");
        int qtdd = leia.nextInt();




        switch (codigo) {
            case 100:
                System.out.print("O pedido foi Cachorro quente e o total do pedido é " + (qtdd * 1.20));
                break;
            case 101:
                System.out.print("O pedido foi Bauru simples e o total do pedido é " + (qtdd * 1.30));
                break;
            case 102:
                System.out.print("O pedido foi Bauru com ovo e o total do pedido é " + (qtdd * 1.50));
                break;
            case 103:
                System.out.print("O pedido foi Hamburguer e o total do pedido é " + (qtdd * 1.20));
                break;
            case 104:
                System.out.print("O pedido foi Cheeseburguer e o total do pedido é " + (qtdd * 1.30));
                break;
            case 105:
                System.out.print("O pedido foi Refrigerante e o total do pedido é" + (qtdd * 1.00));
                break;
            case 106: // CODIGO EXEMPLO DA PROFESSORA //
                double valorTotal = qtdd * 1.10;
                System.out.printf("O pedido foi Veganao e o total do pedido e %.2f ", valorTotal);
                break;
            default:
                System.out.print("Codigo de item invalido");
        }

        System.out.println("\n \n  Bom apetite! Volte sempre!");
    }
}
