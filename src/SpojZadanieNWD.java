import java.util.*;
import java.lang.*;

class SpojZadanieNWD{

    public static int jakijestNWD (int a, int b){
                while (b != 0){
            if (a > b) a -= b;
            else
                b -= a;
        }
        return a;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

        for (int i = 0; i < t ; i++) {
            System.out.println(jakijestNWD(scanner.nextInt(),scanner.nextInt()));
        }

    }
}