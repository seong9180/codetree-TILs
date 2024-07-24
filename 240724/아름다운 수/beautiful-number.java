import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countBeautifulNumbers(n));
    }

    private static int countBeautifulNumbers(int n) {
        return generateBeautifulNumbers("", n);
    }

    private static int generateBeautifulNumbers(String prefix, int n) {
        if (n == 0) {
            return isBeautifulNumber(prefix) ? 1 : 0;
        }

        int count = 0;
        for (int i = 1; i <= 4; i++) {
            String newPrefix = prefix + i;
            count += generateBeautifulNumbers(newPrefix, n - 1);
        }
        return count;
    }

    private static boolean isBeautifulNumber(String s) {
        int length = s.length();
        for (int i = 0; i < length;) {
            int count = 1;
            while (i + count < length && s.charAt(i) == s.charAt(i + count)) {
                count++;
            }
            if (count != Character.getNumericValue(s.charAt(i))) {
                return false;
            }
            i += count;
        }
        return true;
    }
}