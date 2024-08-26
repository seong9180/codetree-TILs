//package NoviceMid.Simulation2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //student number
        int m = sc.nextInt(); //M번에 걸쳐 벌칙에 걸린 학생의 번호가 순서대로 주어질때,
        int k = sc.nextInt(); //k번 이상 벌칙을 받게 되면 벌금을 내야 함

        int[] penalties = new int[m]; //매 라운드마다 벌칙을 받는 학생을 저장할 배열
        int[] penaltyStudents = new int[n+1];
        boolean exist = false;

        for (int i = 0; i < m; i++) {
            penalties[i] = sc.nextInt();
            for (int j = 1; j <= n; j++) { //학생 번호는 1번부터 시작
                if (penalties[i] == j) {
                    penaltyStudents[j]++;
                    if (penaltyStudents[j] >= k) {
                        exist = true;
                        System.out.println(penalties[i]);
                        return;
                    }
                }
            }
        }
        if (!exist) {
            System.out.println(-1);
        }

    }
}