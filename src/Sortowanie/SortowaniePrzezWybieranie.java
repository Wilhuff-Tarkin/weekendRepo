package Sortowanie;

import java.sql.Time;
import java.util.Arrays;

public class SortowaniePrzezWybieranie {

    static void selectSort(int[] tab){

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length ; j++) {
                if (tab [j] > tab [i]){
                    TabUtils.swap(tab, i, j);
                }
        }
        }
        System.out.println();
        System.out.println("Posortowana select sortem: ");
        System.out.println(Arrays.toString(tab));
    }
    }
