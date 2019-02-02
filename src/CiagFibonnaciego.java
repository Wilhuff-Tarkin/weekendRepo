public class CiagFibonnaciego {
    public static int obliczWartoscCiagu(int value){
        if (value == 0) return 0;
        if (value == 1) return 1;
        else return obliczWartoscCiagu(value-1)+(obliczWartoscCiagu(value-2));
    }

    public static void main(String[] args) {
        System.out.println(obliczWartoscCiagu(10));
    }


}
