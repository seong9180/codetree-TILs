import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;

        // Same month case
        if (m1 == m2) {
            totalDays = d2 - d1 + 1;
        } else {
            // Days remaining in the first month
            totalDays += daysInMonth[m1] - d1 + 1;
            // Days in the full months between the two dates
            for (int month = m1 + 1; month < m2; month++) {
                totalDays += daysInMonth[month];
            }
            // Days in the last month
            totalDays += d2;
        }

        System.out.println(totalDays);
    }
}