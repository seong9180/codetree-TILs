import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.close();

        int count = 0;
        for (int i = X; i <= Y; i++) {
            if (isPalindrome(i)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}