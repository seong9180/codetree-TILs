import java.util.*;

public class Main {
    static class Edge {
        int to, l, c;
        Edge(int to, int l, int c) {
            this.to = to;
            this.l = l;
            this.c = c;
        }
    }

    static class State implements Comparable<State> {
        int node;
        long totalL;
        int minC;
        double time;

        State(int node, long totalL, int minC, double time) {
            this.node = node;
            this.totalL = totalL;
            this.minC = minC;
            this.time = time;
        }

        @Override
        public int compareTo(State other) {
            return Double.compare(this.time, other.time);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int L = sc.nextInt();
            int C = sc.nextInt();
            graph.get(I).add(new Edge(J, L, C));
            graph.get(J).add(new Edge(I, L, C));
        }

        double minTime = dijkstra(graph, N, X);
        System.out.println((int) Math.floor(minTime));
    }

    static double dijkstra(List<List<Edge>> graph, int N, int X) {
        PriorityQueue<State> pq = new PriorityQueue<>();
        pq.offer(new State(1, 0, Integer.MAX_VALUE, 0));

        double[][] minTime = new double[N + 1][1000001];  // minTime[node][minC]
        for (int i = 0; i <= N; i++) {
            Arrays.fill(minTime[i], Double.POSITIVE_INFINITY);
        }
        minTime[1][1000000] = 0;  // Use 1000000 as the initial minC

        while (!pq.isEmpty()) {
            State current = pq.poll();

            if (current.node == N) {
                return current.time;
            }

            if (current.time > minTime[current.node][Math.min(current.minC, 1000000)]) {
                continue;
            }

            for (Edge edge : graph.get(current.node)) {
                long newTotalL = current.totalL + edge.l;
                int newMinC = Math.min(current.minC, edge.c);
                double newTime = newTotalL + (double) X / newMinC;

                if (newTime < minTime[edge.to][Math.min(newMinC, 1000000)]) {
                    minTime[edge.to][Math.min(newMinC, 1000000)] = newTime;
                    pq.offer(new State(edge.to, newTotalL, newMinC, newTime));
                }
            }
        }

        return -1; // 경로가 없는 경우
    }
}