package br.com.elaine;

import java.util.Scanner;

/*
Faça um programa que leia N números inteiros, calcule e mostre a quantidade de números pares e a quantida
de números impares.
*/

public class ImparEPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int numero;
        int par = 0, impar = 0;

        System.out.println("Digite a quantidade de números desejada: ");
        qtdNumeros = scan.nextInt();
        System.out.println();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) par++;
            else impar++;

            count++;
        } while (count < qtdNumeros);

        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números impares: " + impar);
    }
}
