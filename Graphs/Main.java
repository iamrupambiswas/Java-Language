public class Main {
    public static void main(String[] args) {
        // AdjacencyListWithNumericVertex graph = new AdjacencyListWithNumericVertex(5);
        // graph.addEdge(0, 1);
        // graph.addEdge(0, 2);
        // graph.addEdge(1, 3);
        // graph.addEdge(2, 4);

        // AdjacencyListWithCharVertex graph = new AdjacencyListWithCharVertex();
        // graph.addEdge('A', 'B');
        // graph.addEdge('A', 'C');
        // graph.addEdge('B', 'D');
        // graph.addEdge('C', 'E');

        // graph.printGraph();

        int[][] graph = {
            {1, 2},
            {0, 3},
            {0, 3},
            {1, 2, 4},
            {3}
        };

        Traversals traversals = new Traversals();
        System.out.println("BFS starting from vertex 0:");
        traversals.bfs(graph, 0);

        System.out.println("\nDFS starting from vertex 0:");
        boolean[] visited = new boolean[graph.length];
        traversals.dfs(graph, 0, visited);

        System.out.println("\nIterative DFS starting from vertex 0:");
        traversals.dfsIterative(graph, 0);
    }
}