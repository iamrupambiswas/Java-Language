package DisjointSets;

public class Dsu {

    private int[] parent;
    private int[] rank;

    public Dsu(int size) {
        parent = new int[size];
        rank = new int[size];

        for(int i=0;i<size;i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int x) {
        if(parent[x] == x) {
            return x;
        }

        parent[x] = find(parent[x]);
        return parent[x];
    }

    public void union(int x, int y) {
        int parentA = find(x);
        int parentB = find(y);

        if(parentA == parentB) {
            return;
        }

        if(rank[parentA] > rank[parentB]) {
            parent[parentB] = parentA;
        } else if(rank[parentA] < rank[parentB]) {
            parent[parentA] = parentB;
        } else {
            parent[parentB] = parentA;
            rank[parentA]++;
        }
    }

    public boolean isConnected(int i, int j) {
        return find(i) == find(j);
    }
}
