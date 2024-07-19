import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 우선순위 큐 생성. 절댓값 기준으로 정렬, 절댓값이 같은 경우는 실제 값으로 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int abs1 = Math.abs(o1);
                int abs2 = Math.abs(o2);
                if (abs1 == abs2) {
                    return Integer.compare(o1, o2);
                }
                return Integer.compare(abs1, abs2);
            }
        });

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x != 0) {
                // x가 0이 아니면 큐에 추가
                pq.offer(x);
            } else {
                // x가 0이면 절댓값이 가장 작은 값 출력 후 제거
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
            }
        }
        scanner.close();
    }
}