package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int soma(int[] numeros) {
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        return soma;
    }
}