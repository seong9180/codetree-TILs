//package codetree.middle.Simulation1;

import java.util.Scanner;

public class Main {
    public static int m1,d1,m2,d2;

    public static int totalDayCount(int m, int d) {
        //월별 최대일수를 저장하는 배열 생성
        int[] monthMaxDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDay = 0;
        for (int i = 0; i < m - 1; i++) { //1월부터 ~ m -1 월까지 지내온 일수 합산
            totalDay += monthMaxDay[i];
        }
        totalDay += d; //m 월에서 지나온 일수 만큼 더함 (d 일)
        return totalDay;
    }
    public static int daysBetween() { //day A 와 day B 의 '일수' 차이를 구하는 함수
        int dayA = totalDayCount(m1, d1);
        int dayB = totalDayCount(m2, d2);

        return dayB - dayA; //출력이 - 면 b가 a 이전, + 라면 b 가 a 이후
    }
    public static int getDayOfWeek() { //요일을 구하는 메소드
        int dayGap = daysBetween();
        //System.out.println("daygap = " + dayGap);
        if (dayGap < 0) { // b 가 a 보다 이전
            dayGap = Math.abs(dayGap); //절대값 처리
            return (dayGap % 7);
        } else if (dayGap == 0) {
            return 100;
        } else{
            return -(dayGap % 7); // b가 a 의 뒤인지 앞인지에 따라 시작되는 요일이 다름
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //2011 m1 d1 > 월요일
        // 2011 m2 d2 > 무슨 요일? (2011 윤년 x)

        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();

        //System.out.println("일 수 차이 : " + daysBetween());
        //System.out.println("흠 : " + getDayOfWeek());

        if(getDayOfWeek() == 1){
            System.out.println("Sun");
        } else if (getDayOfWeek() == 2) {
            System.out.println("Sat");
        } else if (getDayOfWeek() == 3) {
            System.out.println("Fri");
        } else if (getDayOfWeek() == 4) {
            System.out.println("Thu");
        } else if (getDayOfWeek() == 5) {
            System.out.println("Wed");
        } else if (getDayOfWeek() == 6) {
            System.out.println("Tue");
        } else if (getDayOfWeek() == 0) {
            System.out.println("Mon");
        } else if (getDayOfWeek() == 100) { // a == b 일 때
            System.out.println("Mon");
        } else if (getDayOfWeek() == -1) {
            System.out.println("Tue");
        } else if (getDayOfWeek() == -1) {
            System.out.println("Wed");
        } else if (getDayOfWeek() == -1) {
            System.out.println("Thu");
        } else if (getDayOfWeek() == -1) {
            System.out.println("Fri");
        } else if (getDayOfWeek() == -1) {
            System.out.println("Sat");
        } else if (getDayOfWeek() == -1) {
            System.out.println("Sun");
        }
    }
}