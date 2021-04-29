package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pratica008 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(5);
        lista.add("Taina");
        lista.add("Stellinha");
        lista.add("Tequillina");
        lista.add("Pituzinho");
        lista.add("Gabi");

        System.out.println(lista);

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual dos nomes abaixo voce deseja excluir da lista?");
        System.out.println("1 - Taina");
        System.out.println("2 - Stellinha");
        System.out.println("3 - Tequillinha");
        System.out.println("4 - Pituzinho");
        System.out.println("5 - Gabi");
        int numero = scan.nextInt();

        switch (numero) {
            case 1:
                lista.remove(0);
                System.out.println("Voce removeu Taina da lista");
                break;
            case 2:
                lista.remove(1);
                System.out.println("Voce removeu Stellinha da lista");
                break;
            case 3:
                lista.remove(2);
                System.out.println("Voce removeu Tequillinha da lista");
                break;
            case 4:
                lista.remove(3);
                System.out.println("Voce removeu Pituzinho da lista");
                break;
            case 5:
                lista.remove(4);
                System.out.println("Voce removeu Gabi da lista");
                break;
            default:
                System.out.println("Nome nao cadastrado. Tente novamente!");
        }

        System.out.println(lista);

    }
}
