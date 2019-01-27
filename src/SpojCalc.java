import java.util.Scanner;

public class SpojCalc {

    public static int obliczenia (String [] tab){
        int result =  0;
        int a = Integer.parseInt(tab[1]);
        int b = Integer.parseInt(tab [2]);
        if (tab[0].equals("+")) result = a + b;
        if (tab[0].equals("-")) result = a - b;
        if (tab[0].equals("*")) result = a * b;
        if (tab[0].equals("/")) result = a / b;
        if (tab[0].equals("%")) result = a % b;
        return result;
    }



    public static void main (String[] args) throws java.lang.Exception {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String calculateInstructions = scanner.nextLine();
            String[] calculate = calculateInstructions.split(" ");
            System.out.println(obliczenia(calculate));
        }

    }
}

//
//Wejście:
//        + 7 9
//        - 0 4
//        * 5 6
//        / 8 3
//        % 5 2
//
//        Wyjście:
//        16
//        -4
//        30
//        2
//        1