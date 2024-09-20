import java.util.*;

public class Main {

    // 각 정점의 인접 리스트 (간선 정보와 가중치를 저장)
    static List<Node>[] graph;
    static final int INF = 1000000000;  // 무한을 의미하는 값 (충분히 큰 값)
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // n: 정점의 개수, m: 간선의 개수
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // a, b, c 정점 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // 그래프 초기화
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // 간선 정보 입력
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph[u].add(new Node(v, w));
            graph[v].add(new Node(u, w));  // 양방향 그래프
        }
        
        // 다익스트라 알고리즘을 통해 a, b, c에서 각 정점까지의 최단 거리 계산
        int[] distFromA = dijkstra(a, n);
        int[] distFromB = dijkstra(b, n);
        int[] distFromC = dijkstra(c, n);
        
        // 특정 정점에서 a, b, c 중 가장 가까운 거리의 최댓값을 계산
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int minDist = Math.min(distFromA[i], Math.min(distFromB[i], distFromC[i]));
            result = Math.max(result, minDist);
        }
        
        // 결과 출력
        System.out.println(result);
    }
    
    // 다익스트라 알고리즘 구현
    static int[] dijkstra(int start, int n) {
        int[] dist = new int[n + 1];  // 최단 거리 배열
        Arrays.fill(dist, INF);  // 초기값을 무한대로 설정
        dist[start] = 0;
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        
        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int curNode = current.index;
            int curDist = current.distance;
            
            // 이미 처리된 노드는 무시
            if (curDist > dist[curNode]) continue;
            
            // 인접한 노드 확인
            for (Node next : graph[curNode]) {
                int newDist = dist[curNode] + next.distance;
                if (newDist < dist[next.index]) {
                    dist[next.index] = newDist;
                    pq.offer(new Node(next.index, newDist));
                }
            }
        }
        
        return dist;
    }
}

// 간선 정보를 저장할 클래스
class Node implements Comparable<Node> {
    int index;  // 정점 번호
    int distance;  // 가중치 (거리)
    
    Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }
    
    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.distance, o.distance);
    }
}