import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 숫자 등장 횟수 세기
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 등장 횟수와 숫자 기준으로 정렬
        List<Entry<Integer, Integer>> sortedList = new ArrayList<>(countMap.entrySet());
        sortedList.sort((e1, e2) -> {
            if (e2.getValue().equals(e1.getValue())) {
                return e2.getKey().compareTo(e1.getKey());
            }
            return e2.getValue().compareTo(e1.getValue());
        });

        // 상위 k개의 숫자 출력
        for (int i = 0; i < k; i++) {
            System.out.print(sortedList.get(i).getKey() + " ");
        }
    }
}