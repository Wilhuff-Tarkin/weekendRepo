import java.util.Arrays;
import java.util.Scanner;

public class SpojFlamaster {

    public static String [] stworzTablice(){
        Scanner scanner = new Scanner(System.in);
        int liczbaWierszy = scanner.nextInt();
        String [] tablica = new String[liczbaWierszy];

        for (int i = 0; i < liczbaWierszy; i++) {
            tablica [i] = scanner.next();
        }

        System.out.println(Arrays.toString(tablica));
        return tablica;
    }

    public static boolean sprawdzCzySąDuplikaty (String [] tab){
//        for (:
//             ) {
//
//        }


        return true;
    }

    public static void main(String[] args) {
        String [] tab1 = stworzTablice();
        sprawdzCzySąDuplikaty(tab1);

        //     System.out.println(Arrays.toString(tab1));
  //      System.out.println(liczbaWierszy);

    }

}




//4
//        OPSS
//        ABCDEF
//        ABBCCCDDDDEEEEEFGGHIIJKKKL
//        AAAAAAAAAABBBBBBBBBBBBBBBB
//        prawidłowym rozwiązaniem jest:
//        OPSS
//        ABCDEF
//        ABBC3D4E5FGGHIIJK3L
//        A10B16