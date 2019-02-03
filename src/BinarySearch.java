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
    public static int wyszukajBinarnieRekurencja (int [] tab, int lewo, int prawo, int szukany){
        if (lewo > prawo) return -1;

        int wynik= 0;
        int srodek = (lewo + prawo)/2;

        if (tab[srodek] == szukany){
            wynik = srodek;
            System.out.println("wynik = " + srodek);
        };

     //   if (tab[srodek]>szukany
     //TODO dokonczyc, rekurencyjnie przekazuje srodek -1 lub +1 jako argument do samej siebie (jako lewo lub prawo)

        return wynik;
    }
}
