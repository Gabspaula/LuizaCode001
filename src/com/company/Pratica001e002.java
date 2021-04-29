package com.company;

import java.util.Scanner;

public class Pratica001e002 {

    /* Escreva um algoritmo que leia o peso e a altura de um usuario e informe o seu Indice de Massa Corpórea (IMC).
    O calculo é obtido pela divisão entre o valor do seu peso e o quadrado do valor da sua altura.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o seu peso: ");
        float peso = scan.nextFloat();

        System.out.print("Informe a sua altura: ");
        float altura = scan.nextFloat();

        float imc = peso / (altura * altura);
        System.out.println("O seu IMC é " + imc);

        System.out.format("O seu IMC é %.2f ", imc);

        if (imc < 19.1){
            System.out.println("\nVoce esta abaixo do peso.");
        } else if( imc >= 19.1 && imc < 25.8) {
            System.out.println("\nVoce esta no peso normal.");
        } else if ( imc >= 25.8 && imc < 27.3) {
            System.out.println("\nVoce esta marginalmente acima do peso.");
        } else if ( imc >= 27.3 && imc < 32.3) {
            System.out.println("\nVoce esta acima do peso.");
        } else {
            System.out.println("\nObesidade Grau I");
        }
    }
}
