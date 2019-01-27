import java.util.Arrays;
import java.util.Scanner;

public class SpojZadanie {

    public static boolean [] tablica = stworzSito(10000);

    public static boolean [] stworzSito (int size){

        tablica = new boolean [size];

        Arrays.fill(tablica, true);
        tablica[0] = tablica[1] = false;

        for (int i = 2; i < tablica.length ; i++) {
            if (tablica[i]){
                for (int j = i+i; j < tablica.length ; j+=i) {
                    tablica[j] = false;
                }
            }
        }

        return tablica;
    }

    public static boolean czyPodanaJest (int a){
        return  (tablica[a]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //liczba testow
        int liczba; //zmienna pod kolejne wejscia do sprawdzenia

        for (int i = 0; i < n; i++) {
            liczba = scanner.nextInt();
            if (liczba > tablica.length) System.out.println("Za małe sito!");
            else {
                if (czyPodanaJest(liczba)) System.out.println("TAK");
                else System.out.println("NIE");}
                    }
    }

}
