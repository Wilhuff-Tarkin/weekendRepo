package Sortowanie;

import java.util.Arrays;

public class BubbleSort {

    static void bubble(int[] tab) {

        int zakres = tab.length;

        for (int j = 0; j < zakres-1; j++) {


            for (int i = 0; i < zakres-1-j; i++) { //omija te elementy po ktorych juz przeszed; -j
                if (tab[i+1] < tab[i]) {
                    TabUtils.swap(tab, i, i+1);
                }

            }

        }
        System.out.println();
        System.out.println("Posortowana bubble sortem: ");
        System.out.println(Arrays.toString(tab));

    }
}