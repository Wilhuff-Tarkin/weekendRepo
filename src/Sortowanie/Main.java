package Sortowanie;

import java.util.Arrays;

import static Sortowanie.SortowaniePrzezWybieranie.selectSort;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nieposortowana: ");
        int[] tab = {150, 4, 5, 3, 2, 44, 21, 666};
        int[] tab2 = {12, 3, 5, 11, 6, 8, 1, 4};
        int[] tab3 = {2334, 234, 150, 4, 5, 3, 2, 44, 21, 666};


        System.out.println(Arrays.toString(tab));
        selectSort(tab.clone()); // sortowanie przez wybieranie
        BubbleSort.bubble(tab.clone());
        SortowaniePrzezZliczanie.countSort(tab2.clone(), 50);
        InsertSort.insert(tab.clone());

        System.out.println();
        System.out.println("wynik quick sort:");
        System.out.println(Arrays.toString(QuickSort.quicksortuj(tab, 0, tab.length-1)));

        System.out.println();
        System.out.println("wynik sort przez kopcowanie:");
        System.out.println(Arrays.toString(SortowaniePrzezKopcowanie.sortuj(tab3)));

    }
}