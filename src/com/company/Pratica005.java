package com.company;

import java.util.Scanner;

public class Pratica005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor para realizar um calculo: ");
        int num = scan.nextInt();

        System.out.println("1 - Raiz Quadrada");
        System.out.println("2 - A metade");
        System.out.println("3 - 10% do numero");
        System.out.println("4 - O dobro");
        System.out.println("5 - Sair");

        System.out.println("Qual o calculo que deseja realizar?");
        int calculo = scan.nextInt();

        int valorTotal;


        switch (calculo) {
            case 1:
//                valorTotal = Math.sqrt(num);
                System.out.println("A raiz quadrada é " + Math.sqrt(num) );
                break;
            case 2:
                System.out.println("A metade é " + num / 2);
                break;
            case 3:
                System.out.println("10% do numero é " + (num * 10) / 100);
                break;
            case 4:
                valorTotal = num * 2;
                System.out.printf("O dobro do valor é %d ", valorTotal);
                break;
            default:
                System.out.print("Ate mais!");
        }
    }
}
