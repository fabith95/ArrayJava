/*
Crear una clase llamada ArraySupreme, que debe recibir en un constructor la longitud de un arreglo
que se inicialice allí. Ademas debe llenar el arreglo con números de forma aleatoria entre 500 - 1000.
Por ultimo generen un metodo que imprima la suma de los número impares dentro del arreglo.
*/

package org.example;

import java.util.Random;

public class ArraySupreme {
    private int[] arrayRandom;

    public ArraySupreme(int length) {
        arrayRandom = new int[length];
        fillWithRandomNumbers();
    }

    private void fillWithRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = random.nextInt(501) + 500;
        }
    }

    // Método imprimir la suma de números impares del arreglo
    public void printSumOfOddNumbers() {
        int sum = 0;
        for (int num : arrayRandom) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        System.out.println("La suma de los números impares es: " + sum);
    }

    // Método para imprimir el arreglo
    public void printArray() {
        System.out.print("Arreglo: [");
        for (int i = 0; i < arrayRandom.length; i++) {
            System.out.print(arrayRandom[i]);
            if (i != arrayRandom.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        ArraySupreme arraySupreme = new ArraySupreme(10); // Crear un arreglo de longitud 10
        arraySupreme.printArray();
        arraySupreme.printSumOfOddNumbers();
    }
}
