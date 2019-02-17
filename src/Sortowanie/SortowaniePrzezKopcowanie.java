package Sortowanie;

import kopiec.Kopiec;

public class SortowaniePrzezKopcowanie {

    public static int [] sortuj (int [] tab)  {
        Kopiec kopiec = new Kopiec();

        kopiec.odtworzStruktureKopca(tab);

        int n = tab.length;

        for (int i = n-1; i >= 0 ; i--) {
            int tmp = tab [i];
            tab [i] = tab [0];
            tab [0] = tmp;

            kopiec.stworz(tab, i, 0);
                    }


    return tab;
    }
}
