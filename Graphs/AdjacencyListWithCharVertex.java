import java.util.*;

public class AdjacencyListWithCharVertex {
    private Map<Character, List<Character>> adjList;

    public AdjacencyListWithCharVertex() {
        adjList = new HashMap<>();
    }

    public void addVertex(char vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(char src, char dst) {
        addVertex(src);
        addVertex(dst);

        adjList.get(src).add(dst);
        adjList.get(dst).add(src); // For undirected graph
    }

    public void printGraph() {
        System.out.println("Graph Adjacency List:");
        for (Map.Entry<Character, List<Character>> entry : adjList.entrySet()) {
            System.out.print("Vertex " + entry.getKey() + " -> " + entry.getValue());
            System.out.println();
        }
    }

}
