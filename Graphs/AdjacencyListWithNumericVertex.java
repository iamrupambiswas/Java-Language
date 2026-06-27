import java.util.*;

class AdjacencyListWithNumericVertex {
    private int numOfVertices;
    private List<List<Integer>> adjList;

    public AdjacencyListWithNumericVertex(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        adjList = new ArrayList<>();

        for(int i=0;i<numOfVertices;i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dst) {
        adjList.get(src).add(dst);
        adjList.get(dst).add(src); // For undirected graph
    }

    public void printGraph() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < numOfVertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}