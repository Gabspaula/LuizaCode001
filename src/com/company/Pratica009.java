package com.company;

import java.util.Arrays;
import java.util.Random;

public class Pratica009 {
    public static void main(String[] args) {

        Random random = new Random();

        int lista[] = new int[10];    // 10 NUMEROS SERA GERADOS //

        for (int i = 0; i < lista.length; i++) {
            lista[i] = 10 + random.nextInt(90);   // NUMEROS GERADOS ATE O 100 //
            System.out.println(lista[i]);
        }
        System.out.println("O maior valor da lista é: " + (Arrays.stream(lista).max()));
    }
}