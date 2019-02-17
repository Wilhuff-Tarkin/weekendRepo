package JVM;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortJVM {


    public static void swap (int [] tab, int i, int j) {
        int tmp = tab [i];
        tab [i] = tab [j];
        tab [j] = tmp;
    }

    public static void bubbleSorter (int [] tab){
        int zakres = tab.length;

        for (int i = 0; i < zakres; i++) {
            for (int j = 0; j < zakres ; j++) {
                if (tab [i] < tab [j]){
                    swap(tab, i, j);
                }
            }
        }

        System.out.println("posortowana bubble sortem: " + Arrays.toString(tab));
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println(Runtime.getRuntime().maxMemory());
    }

    public static void main(String[] args) {
        Random random = new Random();
        int [] tab = new int [random.nextInt(10)];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(30);
        }
        bubbleSorter(tab);

    }
}
