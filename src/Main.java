import Drzewa.BinarneDrzewoPrzeszukiwan;
import dijkstra.Dijkstra;

public class Main {


    public static void main(String[] args) {
      //  OperacjeNaTablicach.wykonakOperacjeNaTablicach();
        int[] numbers1 = new int[20]; //deklaruje tablice o 20 indeksach na ktorej bedzie operowal binary search
      //  System.out.println(BinarySearch.wyszukajBinarnie(numbers1, 30));
      //  wywolajBST();
        Dijkstra.run();

    }

    public static void wywolajBST (){
        BinarneDrzewoPrzeszukiwan bst = new BinarneDrzewoPrzeszukiwan();
        bst.dodaj(5);
        bst.dodaj(2);
        bst.dodaj(7);
        bst.dodaj(10);
        bst.dodaj(3);
        bst.dodaj(6);
        bst.dodaj(15);
        bst.dodaj(21);
        bst.dodaj(1);
        bst.usun(1);
        bst.usun(7);
    }

}