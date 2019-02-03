package dijkstra;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra {

    private LinkedList<Vertex>[] listAdjacent;

    private int n;

    private boolean [] visitedTab;

    private int [] distanceTab;

    private int [] sourceTab;

    private PriorityQueue <Vertex> priorityQueue;

    public Dijkstra(LinkedList<Vertex>[] listAdjacent, int n) {   /// indexy tablicy beda odpowiadac liczbie nod'ów
        this.listAdjacent = listAdjacent;
        this.n = n;
        this.visitedTab = new boolean[n];
        this.distanceTab = new int[n];
        this.sourceTab = new int[n];
        this.priorityQueue = new PriorityQueue<>(n, new VertexComparator());

    }

    public void calculateMinPath (int source){
        for (int i = 0; i < n; i++) {
            distanceTab[i]= Integer.MAX_VALUE;  //przypisujemy nieskonczonosc
            sourceTab[i] = -1;           //zerowanie tablicy
            visitedTab[i] = false;      // zerowanie tablicy
        }

        distanceTab[source] = 0;
        sourceTab[source] = source;

        priorityQueue.add(new Vertex (source, distanceTab[source]));  // na kolejke dodajemy pierwszy obiekt

        while (!priorityQueue.isEmpty()){

            //S - source
            Vertex vS = priorityQueue.poll();

            int idS = vS.getId();
            int wS = vS.getWeight();

            if (visitedTab[idS]){
                continue;
            }

            visitedTab[idS] = true;


            //D - destination

            for (Vertex vD : listAdjacent[idS]){
                int idD = vD.getId();
                int wD = vD.getWeight();

                if (!visitedTab[idD] && (wS + wD < distanceTab[idD])){
                    distanceTab[idD] = wS + wD;
                    sourceTab[idD] = idS;
                    priorityQueue.add(new Vertex(idD, distanceTab[idD]));
                }

            }

        }

    }

    public void print (){
        System.out.println("Distance: ");
        for (int i = 0; i < n; i++) {
            System.out.println(distanceTab[i]);
        }

        System.out.println();
        System.out.println();

        System.out.println("Source: ");
        for (int i = 0; i < n; i++) {
            System.out.println(sourceTab[i] + " ");
        }
        System.out.println();
    }

    public static void run () {
        Scanner scanner = new Scanner(System.in);
        int vNum; //ilosc wirzcholki
        int eNum; //ilosc krawedzi


        System.out.println("Podaj ilosc wierzcholkow:");
        vNum = scanner.nextInt();

        System.out.println("Podaj ilosc krawedzi:");
        eNum = scanner.nextInt();

        LinkedList <Vertex> [] list = new LinkedList [vNum];
        for (int i = 0; i < vNum ; i++) {
            list[i] = new LinkedList<>();
        }

        System.out.println("Podaj wierzcholek_1, wierzcholek_2 i wagę:");
        for (int i = 0; i < eNum; i++) {

            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            int weight = scanner.nextInt();

            list[source].add(new Vertex(destination, weight));
            }

        Dijkstra dijkstra = new Dijkstra(vNum, list);
        dijkstra.calculateMinPath(0);
        dijkstra.print();

        ;


    }

    public Dijkstra(int n, LinkedList <Vertex> [] list ){   //n liczba wierzcholkow, lista sasiedztwa

    }


}
