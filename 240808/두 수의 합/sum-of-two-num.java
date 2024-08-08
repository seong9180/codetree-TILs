import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] numbers = new int[n];
        input = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        // 두 수의 합이 k가 되는 가짓수 구하기
        System.out.println(countPairs(numbers, k));
    }

    public static int countPairs(int[] numbers, int k) {
        int count = 0;
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numbers) {
            int complement = k - number;
            if (frequencyMap.containsKey(complement)) {
                count += frequencyMap.get(complement);
            }
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        return count;
    }
}