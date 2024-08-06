import java.util.*;

public class Main {
    static List<List<Edge>> tree;
    static int d;
    static int[] dist;
    static int farthestNode;

    static class Edge {
        int to;
        int length;

        Edge(int to, int length) {
            this.to = to;
            this.length = length;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = sc.nextInt();

        tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int length = sc.nextInt();
            tree.get(u).add(new Edge(v, length));
            tree.get(v).add(new Edge(u, length));
        }

        // Find the farthest node from node 1
        dist = new int[n + 1];
        dfs(1, -1, 0);

        // Find the farthest node from the previously found farthest node
        int start = farthestNode;
        dist = new int[n + 1];
        dfs(start, -1, 0);

        int diameter = dist[farthestNode];
        int days = (diameter + d - 1) / d;
        System.out.println(Math.max(days, 2));
    }

    static void dfs(int node, int parent, int distance) {
        dist[node] = distance;
        if (distance > dist[farthestNode]) {
            farthestNode = node;
        }

        for (Edge edge : tree.get(node)) {
            if (edge.to != parent) {
                dfs(edge.to, node, distance + edge.length);
            }
        }
    }
}