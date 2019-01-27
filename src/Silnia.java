public class Silnia {

    public static int policzSilnie (int n){
    if (n == 0) return 1;
    if (n == 1) return 1;

    return n * policzSilnie(n-1);

    }


    public static void main(String[] args) {
        System.out.println(policzSilnie(15));
    }
}
