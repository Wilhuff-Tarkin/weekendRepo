public class NWD {
    public static int jakijestNWD (int a, int b){

        //w ulepszonej wersji wkorzystuje reszte z dzielenia, algorytm euklidesa

        while (b != 0){
            if (a > b) a -= b;
            else
                b -= a;
            }
        return a;
    }

    public static int jakijestNWD3 (int a, int b){ //rekurencyjnie
        if (b != 0)
            return jakijestNWD3(b, a%b) ;
            else return a;

        }





    public static int jakijestNWD2 (int a, int b){
        while (b != 0){
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    public static void main(String[] args) {

        long start;
        long stop; //do mierzenia czasu


        start = System.nanoTime();
        System.out.println(jakijestNWD(100000,4));
        stop = System.nanoTime();
        System.out.println("czas wykonania operacji nwd " + (stop - start) + " nanosekund");

        start = System.nanoTime();
        System.out.println(jakijestNWD2(100000,4));
        stop = System.nanoTime();
        System.out.println("czas wykonania operacji nwd2 " + (stop - start) + " nanosekund");
    }

}
