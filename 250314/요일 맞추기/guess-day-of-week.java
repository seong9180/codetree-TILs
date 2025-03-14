import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        // 기준 날짜(1월 1일)부터의 누적 날짜 계산
        int startDate = 0, endDate = 0;
        for (int i = 0; i < m1 - 1; i++) {
            startDate += month[i];
        }
        startDate += d1;

        for (int i = 0; i < m2 - 1; i++) {
            endDate += month[i];
        }
        endDate += d2;

        int dateGap = endDate - startDate; // 날짜 차이 계산

        int index;
        if (dateGap >= 0) {  // 미래 날짜일 경우 (그냥 앞으로 이동)
            index = (dateGap % 7) % 7;
        } else {  // 과거 날짜일 경우 (뒤로 이동해야 함)
            index = (7 + (dateGap % 7)) % 7;
        }

        System.out.println(day[index]);
    }
}
