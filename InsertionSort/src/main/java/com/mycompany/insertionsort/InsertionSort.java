package com.mycompany.insertionsort;

public class InsertionSort {

    // Método padrão para ordenar em ordem crescente
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move os elementos do arr[0..i-1] que são maiores que key para uma posição à frente
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Método sobrecarregado para ordenar com a possibilidade de ordem decrescente
    public static void sort(int[] arr, boolean descending) {
        if (!descending) {
            sort(arr); // Se descending for falso, use o método de ordenação crescente
            return;
        }

        // Ordenação decrescente
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move os elementos do arr[0..i-1] que são menores que key para uma posição à frente
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Método principal para testar o algoritmo
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        // Ordenação crescente
        sort(arr);
        System.out.println("Ordem Crescente:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Ordenação decrescente
        sort(arr, true);
        System.out.println("Ordem Decrescente:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

