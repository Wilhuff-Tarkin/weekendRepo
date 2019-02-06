package Sortowanie;

import java.util.Arrays;

public class QuickSort {

    static void quicksortuj(int[] tab, int lewy, int prawy) {
        int pivot = tab[lewy + prawy / 2];
        int i = lewy;
        int j = prawy;

        while (i <= j) {
            while (tab[i] < pivot) {
                i++;
            }

            while (tab[j] > pivot) {
                j--;
            }

            if (i <= j) {
                TabUtils.swap(tab, i, j);
                i++;
                j--;
            }
            if (lewy < j) {
                    quicksortuj(tab, lewy, j);
            }
            if (i < prawy) {
                quicksortuj(tab, i, prawy);
            }

            System.out.println();
            System.out.println("wynik quick sort:");
            System.out.println(Arrays.toString(tab));

        }


    }
}