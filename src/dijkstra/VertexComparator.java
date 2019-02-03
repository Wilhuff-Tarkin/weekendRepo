package dijkstra;

import java.util.Comparator;

public class VertexComparator implements Comparator <Vertex> {


    @Override
    public int compare(Vertex o1, Vertex o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }
}
