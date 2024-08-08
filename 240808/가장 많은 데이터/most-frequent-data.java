import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = Integer.parseInt(scanner.nextLine());
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        // 가장 많이 입력된 데이터의 등장 횟수 찾기
        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        System.out.println(maxFrequency);
    }
}