import java.util.*;
import java.lang.*;

class SpojZadanieTablice
{

    public static void main (String[] args) throws java.lang.Exception
    {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

        for (int i = 0; i <= t ; i++) {
            String dane = scanner.nextLine();
            String[] s = dane.split(" ");
                for (int j = s.length-1; j >= 1 ; j--) {
                    System.out.print(s[j] + " ");
            }
        }
    }
}

//Wejście:
//        2
//        7 1 2 3 4 5 6 7
//        3 3 2 11
//
//        Wyjście:
//        7 6 5 4 3 2 1
//        11 2 3