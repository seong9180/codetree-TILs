import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 노드의 개수 입력
        int n = scanner.nextInt();
        
        // 트리 구조를 표현할 인접 리스트
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }
        
        // 트리 연결 관계 입력
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            tree.get(a).add(b);
            tree.get(b).add(a);
        }
        
        // 부모 노드를 저장할 배열
        int[] parents = new int[n + 1];
        
        // BFS를 사용하여 부모 노드 찾기
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        
        queue.offer(1);  // 루트 노드부터 시작
        visited[1] = true;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            for (int child : tree.get(current)) {
                if (!visited[child]) {
                    parents[child] = current;
                    visited[child] = true;
                    queue.offer(child);
                }
            }
        }
        
        // 결과 출력
        for (int i = 2; i <= n; i++) {
            System.out.println(parents[i]);
        }
        
        scanner.close();
    }
}