
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Traversals {
    
    public void bfs(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for(int neighbor: graph[vertex]) {
                if(!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public void dfs(int[][] graph, int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for(int neighbor: graph[start]) {
            if(!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }

    public void dfsIterative(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while(!stack.isEmpty()) {
            int node = stack.pop();

            if(visited[node]) continue;

            visited[node] = true;

            System.out.print(node + " ");

            for(int neighbor: graph[node]) {
                if(!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
    }

}
