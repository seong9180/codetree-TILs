import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        int maxLength = 0;
        int currentLength = 0;

        // 배열 순회
        for (int i = 0; i < n; i++) {
            if (array[i] > t) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                currentLength = 0;
            }
        }

        System.out.println(maxLength);
    }
}