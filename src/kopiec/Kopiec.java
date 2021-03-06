package kopiec;

public class Kopiec {

public void stworz (int [] tab, int n, int obecny) {
        int lewy = 2 * obecny + 1;       // lewe dziecko obecnego
        int prawy = 2 * obecny + 2;     // prawe dziecko obecnego
        int najwiekszy = obecny;

        if (lewy < n && tab[lewy] > tab[najwiekszy]) {
            najwiekszy = lewy;
        }

        if (prawy < n && tab[prawy] > tab [najwiekszy]) {
            najwiekszy = prawy;
        }

        if (obecny != najwiekszy) {
            int tmp = tab [obecny];
            tab [obecny] = tab [najwiekszy];
            tab [najwiekszy] = tmp;

            stworz(tab, n, najwiekszy);
        }

    }

public void odtworzStruktureKopca (int [] tab) {
        int n = tab.length;
        for (int i = (n - 1)/2; i >= 0; i--){         // n-1/2 to najnizszy rodzic - potem dekrememuje przechadzac do poprzednich rodzicow
            stworz(tab, n, i);
        }
    }



}
