package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pratica007 {
    public static void main(String[] args) {

        // INCOMPLETO !!! Falta parar a lista quando tiver 5 nomes e adicionar a lista, imprimir //

        List<String> lista = new ArrayList();
        Scanner nomes = new Scanner(System.in);
        int nomesLista = lista.toArray().length;

        do {
            System.out.print("Adicione um nome a lista: ");
            lista.add(nomes.nextLine());
        } while (nomesLista <= 4);

        System.out.println(lista);
    }
}
