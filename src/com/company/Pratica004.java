package com.company;

import java.util.Scanner;

public class Pratica004 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero para descobrir os divisiveis dele: ");
        int numero = scan.nextInt();
        System.out.print("Digite o inicio do intervalo desejado: ");
        int int1 = scan.nextInt();
        System.out.print("Digite o final do intervalo desejado: ");
        int int2 = scan.nextInt();

        int divisivel;

        for (divisivel = int1; divisivel <= int2; divisivel++) {
            if (divisivel % numero == 0) {
                System.out.println("Numero " + numero + " e divisivel por: " + divisivel);
            }
        }
    }
}
