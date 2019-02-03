package Drzewa;

import java.nio.file.Watchable;

public class BinarneDrzewoPrzeszukiwan {

    private Wezel korzen;

    public BinarneDrzewoPrzeszukiwan() {
        korzen = null;

    }

    public void dodaj (int wartosc) {
        korzen = dodajRekurencyjnie(korzen, wartosc);
    }

    public void usun (int wartosc) {
        korzen = usunRekurencyjnie(korzen, wartosc);
    }

    private Wezel dodajRekurencyjnie (Wezel obecny, int wartosc) {
        if (obecny == null) {
            return new Wezel(wartosc);
        }

        if (wartosc < obecny.getWartosc()) {
            obecny.setLewy(dodajRekurencyjnie(obecny.getLewy(), wartosc));
        } else if (wartosc > obecny.getWartosc()){
            obecny.setPrawy(dodajRekurencyjnie(obecny.getPrawy(), wartosc)); // kiedy dotrze do nulla
        }

        return obecny;

    }

    private boolean znajdujeRekurencyjnie (Wezel obecny, int wartosc){
        if (obecny == null) {
            return false;
        }
        if (wartosc == obecny.getWartosc()) {return true;}
        else if (wartosc < obecny.getWartosc()){
            return znajdujeRekurencyjnie(obecny.getLewy(),wartosc);
        } else if (wartosc > obecny.getWartosc()) {
            return znajdujeRekurencyjnie(obecny.getPrawy(), wartosc);
        }

    return false;
    }

    private boolean znajdz (int wartosc){
        return znajdujeRekurencyjnie(korzen, wartosc);
    }

    private Wezel usunRekurencyjnie (Wezel obecny, int wartosc) {

        if (obecny == null) {
            return null;
        }

        if (wartosc == obecny.getWartosc()) { //lisc - nie ma zadnych dzieci
            if (obecny.getLewy() == null && obecny.getPrawy() == null) {
                return null;
            } else if (obecny.getLewy() != null && obecny.getPrawy() == null) { //ma tylko lewą odnogę
                return obecny.getLewy();
            } else if (obecny.getLewy() == null && obecny.getPrawy() != null) { // ma tylko prawa
                return obecny.getPrawy();
            } else  {
                int wartoscMinimumPodrzewa = znajdzWartoscMinimum(obecny.getPrawy()); // ma prawa i lewa
                obecny.setWartosc(wartoscMinimumPodrzewa); //
                obecny.setPrawy(usunRekurencyjnie(obecny.getPrawy(), wartoscMinimumPodrzewa));
            }

        } else if (wartosc < obecny.getWartosc()) {
            obecny.setLewy(usunRekurencyjnie(obecny.getLewy(), wartosc));
        } else if (wartosc > obecny.getWartosc())  {
            obecny.setPrawy(usunRekurencyjnie(obecny.getPrawy(),wartosc));
        }

        return obecny;
    }

    private int znajdzWartoscMinimum (Wezel obecny) {
        while (obecny.getLewy() != null){
        obecny = obecny.getLewy();
        }
    return obecny.getWartosc();
    }

}



