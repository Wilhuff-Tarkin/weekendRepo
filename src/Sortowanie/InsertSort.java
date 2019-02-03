package Sortowanie;

import java.util.Arrays;

public class InsertSort {

    static void insert (int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            for (int j = i; j > 0; j--) {
                if (tab[j] < tab[j-1]) {
                    TabUtils.swap(tab, j, j-1); }

                else {
                    break;
                }
        }
        System.out.println();
        System.out.println("Posortowana insert sortem: ");
        System.out.println(Arrays.toString(tab));

    }
}}