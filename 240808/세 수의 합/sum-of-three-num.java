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

        // 세 수의 합이 k가 되는 가짓수 구하기
        System.out.println(countTriplets(numbers, k));
    }

    public static int countTriplets(int[] numbers, int k) {
        int count = 0;
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int complement = k - numbers[i] - numbers[j];
                if (frequencyMap.containsKey(complement)) {
                    count += frequencyMap.get(complement);
                }
            }
            frequencyMap.put(numbers[i], frequencyMap.getOrDefault(numbers[i], 0) + 1);
        }

        return count;
    }
}