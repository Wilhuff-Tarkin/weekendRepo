import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OperacjeNaTablicach {
    public static boolean czyJestNiemalejaca (int [] tab){
        for (int i = 0; i < tab.length-1; i++){
            if (tab[i] > tab [i +1])
                return false;
        }
        return true;
    }

    public static void stworzTablice (int a) {
        int[] tablica2 = new int[a];
        Random random = new Random();

        for (int i = 0; i < tablica2.length - 1; i++) {
            tablica2[i] = random.nextInt(10);}
        System.out.println("Twoja losowa tablica:");
        System.out.println(Arrays.toString(tablica2));
    }

    public static void sumujDwieTablice (int [] a, int [] b){
        if (a.length != b.length) System.out.println("Tablice nie są tej samej dlugosci");
        else {
            int[] tablicaSuma = new int[a.length];

            for (int i = 0; i < a.length; i++) {
                tablicaSuma[i] = a[i] + b[i];
            }
            System.out.println("Suma tablic: ");
            System.out.println(Arrays.toString(tablicaSuma));
        }
    }

    public static void sumujDwieRozneTablice (int [] a, int [] b) {
        System.out.println("Suma roznych tablic: ");

        if (a.length > b.length) {
            int[] tablicaSuma = new int[a.length];

            for (int i = 0; i < a.length; i++) {
                tablicaSuma[i] = a[i];
            }

            for (int i = 0; i < b.length; i++) {
                tablicaSuma[i] = a[i] + b[i];
            }
            System.out.println(Arrays.toString(tablicaSuma));

        }
        else {
            int[] tablicaSuma = new int[b.length];
            for (int i = 0; i < b.length; i++) {
                tablicaSuma[i] = b[i];
            }

            for (int i = 0; i < a.length; i++) {
                tablicaSuma[i] = a[i] + b[i];
            }
            System.out.println(Arrays.toString(tablicaSuma));


        }
        System.out.println();
    }

    public static void analizaElementow (int [] a){
        int sumaElementow = 0;
        int licznikPowyzejSredniej = 0;
        int licznikPonizejSredniej = 0;


        for (int i = 0; i < a.length; i++){
            sumaElementow += a[i];
        }

        int sredniaWartosc = sumaElementow/a.length;

        for (int i = 0; i < a.length; i++){
            if (a[i]>sredniaWartosc) licznikPowyzejSredniej += 1;
            else if (a[i]<sredniaWartosc) licznikPonizejSredniej += 1;
        }
        System.out.println("Srednia wartosc w tablicy to: " + sredniaWartosc);
        System.out.println("elemntów powyzej sredniej = " + licznikPowyzejSredniej);
        System.out.println("elemntów ponizej sredniej = " + licznikPonizejSredniej);

    }



public static void wykonakOperacjeNaTablicach(){
    //czy jest niemalejąca
    int [] tablica1 = {1, 2, 2, 4, 5};
    System.out.println("Podana tablica jest niemalejąca (true/false):");
    System.out.println(czyJestNiemalejaca(tablica1));
    System.out.println();

    //stworz tablice z losowymi wartosciami
    System.out.println("Podaj wielkosc tablicy");
    Scanner scanner = new Scanner(System.in);
    int wielkoscTablicy = scanner.nextInt();
    stworzTablice(wielkoscTablicy);

    //zsumuj dwie tablice
    int [] tablica2 = {1, 2, 2, 4, 5};
    int [] tablica3 = {1, 2, 2, 4, 5};
    sumujDwieTablice(tablica2, tablica3);

    //zsumuj dwie roznej dlugosci tablice
    int [] tablica4 = {1, 2, 2, 4, 5};
    int [] tablica5 = {1, 2, 2, 4, 5, 6};
    sumujDwieRozneTablice(tablica4, tablica5);

    //srednie z tablicy
    int [] tablica6 = {10, 15, 23, 25, 30, 35};
    analizaElementow(tablica6);

}}
