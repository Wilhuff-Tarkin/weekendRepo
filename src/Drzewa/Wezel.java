package Drzewa;

public class Wezel {

    private int wartosc;
    private Wezel lewy;
    private Wezel prawy;


    public Wezel(int wartosc, Wezel lewy, Wezel prawy) {
        this.wartosc = wartosc;
        this.lewy = lewy;
        this.prawy = prawy;
    }

    public Wezel(int wartosc) {
        this.wartosc = wartosc;
         }

    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public Wezel getLewy() {
        return lewy;
    }

    public void setLewy(Wezel lewy) {
        this.lewy = lewy;
    }

    public Wezel getPrawy() {
        return prawy;
    }

    public void setPrawy(Wezel prawy) {
        this.prawy = prawy;
    }
}
