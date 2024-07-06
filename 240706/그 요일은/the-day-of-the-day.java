//package codetree.middle.Simulation1;

import java.util.Scanner;

public class Main {
    public static int m1,d1,m2,d2;
    public static String month;
    public static int totalDayCount(int m, int d) {
        //월별 최대일수를 저장하는 배열 생성
        int[] monthMaxDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //윤년 2024 년 기준
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
    public static int getDayOfWeek2() { //온전한 일주일이 반복된 횟수
        int dayGap = daysBetween();
        //System.out.println("daygap = " + dayGap);
        if (dayGap < 0) { // b 가 a 보다 이전
            return (dayGap / 7);
        } else if (dayGap == 0) {
            return 0;
        } else{
            return (dayGap / 7); // b가 a 의 뒤인지 앞인지에 따라 시작되는 요일이 다름
        }
    }
    public static String dayBofWeek() { //day B 의 요일 리턴.
        if (getDayOfWeek() == 1) {
            return "Sun";
        } else if (getDayOfWeek() == 2) {
            return "Sat";
        } else if (getDayOfWeek() == 3) {
            return "Fri";
        } else if (getDayOfWeek() == 4) {
            return "Thu";
        } else if (getDayOfWeek() == 5) {
            return "Wed";
        } else if (getDayOfWeek() == 6) {
            return "Tue";
        } else if (getDayOfWeek() == 0) {
            return "Mon";
        } else if (getDayOfWeek() == 100) { // a == b 일 때
            return "Mon";
        } else if (getDayOfWeek() == -1) {
            return "Tue";
        } else if (getDayOfWeek() == -2) {
            return "Wed";
        } else if (getDayOfWeek() == -3) {
            return "Thu";
        } else if (getDayOfWeek() == -4) {
            return "Fri";
        } else if (getDayOfWeek() == -5) {
            return "Sat";
        } else if (getDayOfWeek() == -6) {
            return "Sun";
        } else {
            return "Invalid Day"; // 예외 처리
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        문제 로직
        
        일수 차이 / 7 == x //"온전한 일주일" 이 반복된 횟수
        기준 요일 == 월요일
        목적 요일 == y
        dayB 요일 == z // 알 수 있음

        1.index 순서 상, z가 y 보다 뒤에 있다면 count ++;
        아니라면, x

        2. 목적 요일 y 가 월요일이라면 count ++;
        아니라면, x

         */

        int count = 0; //요일 등장 횟수 저장

        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();
        month = sc.next();

        int index = 0;
        String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (month.equals(daysOfWeek[i])) {
                index = i; //입력으로 주어진 기준 요일을 인덱스로 저장
            }
        }
        //System.out.println("일 수 차이 : " + daysBetween());
        //System.out.println("흠 : " + getDayOfWeek());

        if (getDayOfWeek2() > 0) { //b가 뒤
            count += getDayOfWeek2();
            int indexOfB = 0;
            for (int i = 0; i < daysOfWeek.length; i++) {
                if (dayBofWeek().equals(daysOfWeek[i])) { //dayB의 요일
                    indexOfB = i; //인덱스로 저장
                }
            }
            if (indexOfB >= index) {
                count ++;
            }
        } else if (getDayOfWeek() == 0) { //일주일 이내 간격
            if (month.equals(dayBofWeek())) { //목적 요일이 월요일이라면,
                count++;
            }
        } else {
            count += Math.abs(getDayOfWeek2()); //음수라서 절대값 취하고 더하기
            int indexOfB = 0;
            for (int i = 0; i < daysOfWeek.length; i++) {
                if (dayBofWeek().equals(daysOfWeek[i])) { //dayB의 요일
                    indexOfB = i; //인덱스로 저장
                }
            }
            if (indexOfB <= index) { //순서 반대
                count ++;
            }
        }

        System.out.println(count);
    }
}