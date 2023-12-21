package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

    }

    //Funçao que devolve quociente
    public static double obterQuociente(double dividendo, double divisor) {
        if (divisor != 0) {
            return dividendo / divisor;
        } else {
            // Tratamento para divisão por zero
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Double.NaN; // NaN (Not a Number) pode ser usado para indicar um valor indefinido ou não representável
        }
    }
}