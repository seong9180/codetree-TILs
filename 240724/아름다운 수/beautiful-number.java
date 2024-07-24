import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countBeautifulNumbers(n));
    }

    private static int countBeautifulNumbers(int n) {
        return generateBeautifulNumbers("", n, 1);
    }

    private static int generateBeautifulNumbers(String prefix, int n, int currentLength) {
        if (currentLength > n) {
            return 0;
        }
        if (currentLength == n) {
            return isBeautifulNumber(prefix) ? 1 : 0;
        }

        int count = 0;
        for (int i = 1; i <= 4; i++) {
            String repeated = repeat(i, i);
            count += generateBeautifulNumbers(prefix + repeated, n, currentLength + i);
        }
        return count;
    }

    private static String repeat(int num, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(num);
        }
        return sb.toString();
    }

    private static boolean isBeautifulNumber(String s) {
        int length = s.length();
        int i = 0;
        while (i < length) {
            int num = s.charAt(i) - '0';
            int count = 0;
            while (i < length && s.charAt(i) - '0' == num) {
                i++;
                count++;
            }
            if (count != num) {
                return false;
            }
        }
        return true;
    }
}