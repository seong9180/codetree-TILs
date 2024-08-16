import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 입력을 받아 우선순위 큐에 추가
        for (int i = 0; i < n; i++) {
            pq.add(scanner.nextInt());
        }

        int totalCost = 0;

        // 두 개의 숫자를 꺼내 합치고 다시 큐에 넣는 과정 반복
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int cost = first + second;
            totalCost += cost;
            pq.add(cost);
        }

        // 최소 비용 출력
        System.out.println(totalCost);
    }
}