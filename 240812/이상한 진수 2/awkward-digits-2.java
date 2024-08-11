import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int maxN = 0;

        for (int i = 0; i < a.length(); i++) {
            StringBuilder modified = new StringBuilder(a);
            if (a.charAt(i) == '0') {
                modified.setCharAt(i, '1');
            } else {
                modified.setCharAt(i, '0');
            }
            
            int currentN = Integer.parseInt(modified.toString(), 2);
            maxN = Math.max(maxN, currentN);
        }

        System.out.println(maxN);
    }
}