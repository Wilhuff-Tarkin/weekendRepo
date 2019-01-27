import java.util.Arrays;

public class BinarySearch {
    public static String wyszukajBinarnie (int [] tab, int y){

        int lewo = 0;
        int prawo = tab.length-1;
        String indeks;
        int srodek;

        for (int i = 0; i < tab.length; i++){
            tab[i] = i;
        }

        System.out.println(Arrays.toString(tab));

        while (lewo < prawo){
            srodek = (lewo + prawo)/2;
            if (tab[srodek] < y)
                lewo = srodek+1;
            else
                prawo = srodek;
        }

        if
            (tab[lewo] == y) indeks = String.valueOf(lewo);
        else
            indeks = "brak";

      return indeks;
    }
}
