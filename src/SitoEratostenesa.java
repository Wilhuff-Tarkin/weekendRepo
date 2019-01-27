import java.util.Arrays;
import java.util.Scanner;

public class SitoEratostenesa {

    private static boolean [] tablica = stworzSito(100);


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
        System.out.println("Podaj liczbe do sprawdzenia: ");
        int choice = scanner.nextInt();

        if (choice > tablica.length) System.out.println("Za małe sito!");
        else {
            if (czyPodanaJest(choice)) System.out.println("Podana liczba jest liczbą pierwszą");
            else System.out.println("Podana liczba nie jest liczbą pierwszą");}
    }
}

