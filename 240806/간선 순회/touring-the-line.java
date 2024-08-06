import java.util.*;

public class Main {
    static List<List<Edge>> tree;
    static int d;
    static int totalDistance;
    static int maxDistance;

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

        totalDistance = 0;
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int length = sc.nextInt();
            tree.get(u).add(new Edge(v, length));
            tree.get(v).add(new Edge(u, length));
            totalDistance += length;
        }

        maxDistance = 0;
        dfs(1, -1, 0);

        int days = (int) Math.ceil((double) totalDistance / d);
        System.out.println(Math.max(days, 2));
    }

    static void dfs(int node, int parent, int distance) {
        maxDistance = Math.max(maxDistance, distance);

        for (Edge edge : tree.get(node)) {
            if (edge.to != parent) {
                dfs(edge.to, node, distance + edge.length);
            }
        }
    }
}