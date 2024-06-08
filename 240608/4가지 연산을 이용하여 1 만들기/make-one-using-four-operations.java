import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        // BFS를 위한 큐 생성
        Queue<Integer> queue = new LinkedList<>();
        // 최소 연산 횟수를 저장할 맵 생성
        Map<Integer, Integer> dp = new HashMap<>();
        
        dp.put(N, 0);
        queue.add(N);
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            // 1에 도달하면 결과를 출력하고 종료
            if (current == 1) {
                System.out.println(dp.get(current));
                return;
            }
            
            int nextValue;
            
            // 현재 숫자에서 가능한 연산을 수행하고, 최소 연산 횟수를 갱신
            // 1 빼기
            nextValue = current - 1;
            if (!dp.containsKey(nextValue) || dp.get(nextValue) > dp.get(current) + 1) {
                dp.put(nextValue, dp.get(current) + 1);
                queue.add(nextValue);
            }

            // 1 더하기
            nextValue = current + 1;
            if (!dp.containsKey(nextValue) || dp.get(nextValue) > dp.get(current) + 1) {
                dp.put(nextValue, dp.get(current) + 1);
                queue.add(nextValue);
            }
            
            // 2로 나누기
            if (current % 2 == 0) {
                nextValue = current / 2;
                if (!dp.containsKey(nextValue) || dp.get(nextValue) > dp.get(current) + 1) {
                    dp.put(nextValue, dp.get(current) + 1);
                    queue.add(nextValue);
                }
            }
            
            // 3로 나누기
            if (current % 3 == 0) {
                nextValue = current / 3;
                if (!dp.containsKey(nextValue) || dp.get(nextValue) > dp.get(current) + 1) {
                    dp.put(nextValue, dp.get(current) + 1);
                    queue.add(nextValue);
                }
            }
        }
    }
}