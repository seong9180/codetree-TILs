import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        String str = scanner.next();
        scanner.close();
        
        System.out.println(findMinimumUniqueSubstringLength(N, str));
    }

    private static int findMinimumUniqueSubstringLength(int N, String str) {
        for (int length = 1; length <= N; length++) {
            if (isUniqueSubstringLength(str, length)) {
                return length;
            }
        }
        return N; // In case all lengths up to N are not unique, return N
    }

    private static boolean isUniqueSubstringLength(String str, int length) {
        HashSet<String> seenSubstrings = new HashSet<>();
        
        for (int i = 0; i <= str.length() - length; i++) {
            String substring = str.substring(i, i + length);
            if (seenSubstrings.contains(substring)) {
                return false;
            }
            seenSubstrings.add(substring);
        }
        
        return true;
    }
}