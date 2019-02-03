package Sortowanie;

import java.util.Arrays;

public class SortowaniePrzezZliczanie {

    static void countSort(int[] tab, int nMax){

        int [] tabCount = new int [nMax+1];
        int [] output = new int [tab.length];

        for (int i = 0; i < tab.length ; i++) {
            tabCount[tab[i]]++;
        }

        for (int j = 1; j < tabCount.length; j++) {
                tabCount[j] += tabCount[j-1];
            }

        for (int i = 0; i < tab.length ; i++) {
            output[tabCount[tab[i]] -1 ] = tab[i];
            tabCount[tab[i]] = tabCount[tab[i]] - 1;
        }

        System.out.println();
        System.out.println("Posortowana count sortem: ");
   //     System.out.println(Arrays.toString(tabCount)); pomocnicza liczy wystapienia i pozycje
        System.out.println(Arrays.toString(output));
    }
}


