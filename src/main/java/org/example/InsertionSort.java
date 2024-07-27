package org.example;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {45, 32, 78, 12, 88, 2, 65, 34, 98, 7, 55, 23, 67, 41, 91};

        System.out.println("Початковий масив: " + Arrays.toString(array));

        insertionSort(array);

        System.out.println("Масив після сортування вставкою: " + Arrays.toString(array));
    }
}