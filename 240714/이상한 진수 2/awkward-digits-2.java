import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        scanner.close();
        
        System.out.println(findMaxPossibleN(a));
    }

    public static int findMaxPossibleN(String a) {
        int maxN = 0;
        
        for (int i = 0; i < a.length(); i++) {
            char[] modified = a.toCharArray();
            modified[i] = (a.charAt(i) == '0') ? '1' : '0'; // 한 자리만 바꿈
            int possibleN = Integer.parseInt(new String(modified), 2);
            if (possibleN > maxN) {
                maxN = possibleN;
            }
        }

        return maxN;
    }
}