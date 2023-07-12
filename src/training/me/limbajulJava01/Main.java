package training.me.limbajulJava01;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Declarare și inițializare variabile
        int a = 5;
        int b = 10;

        // Utilizarea operatorilor
        int suma = a + b;
        int diferenta = a - b;
        int produs = a * b;
        double cat = (double) a / b;

        // Afișarea rezultatelor
        System.out.println("Suma: " + suma);
        System.out.println("Diferenta: " + diferenta);
        System.out.println("Produs: " + produs);
        System.out.println("Cat: " + cat);

        // Propoziții condiționale
        if (a > b) {
            System.out.println("a este mai mare decât b");
        } else if (a < b) {
            System.out.println("a este mai mic decât b");
        } else {
            System.out.println("a și b sunt egale");
        }

        // Instrucțiuni repetitive
        for (int i = 0; i < 5; i++) {
            System.out.println("Numărul: " + i);
        }

        // Matrice
        int[][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Afișarea matricei
        for (int[] rand : matrice) {
            for (int element : rand) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Utilizarea bibliotecilor încorporate
        int[] array = {5, 2, 8, 1, 9};

        // Sortarea array-ului utilizând metoda sort() din clasa Arrays
        Arrays.sort(array);

        // Afișarea array-ului sortat
        System.out.println("Array sortat: " + Arrays.toString(array));
    }
}
