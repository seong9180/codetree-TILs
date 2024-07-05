import java.util.Scanner;

public class Main {
    public static int countMonth(int i){
        if(i == 2){
            return 28;
        }else if(i <= 7){
            if(i % 2 == 0){ //짝수이면
                return 30;
            }else{
                return 31;                }
        }else{ //8월~
            if(i % 2 == 0){ //짝수이면
                return 31;
            }else{
                return 30;
            }
        }   
    }
    public static int exclusiveDay(int m1, int d1, int m2, int d2){
        //exclusiveDay 를 구하는 로직
        //시작 월, 일 m1, d1
        //(m1 월의 최대일 - d1) + 그 사이 월
        int exclusive_day = 1; //첫 날 포함해서 계산하기 때문에 0 > 1
        if(m1 == m2 && d1 == d2){ //동일한 날이 주어지면,
            exclusive_day = 0;
        }
        //1. m1 과 m2의 차이 구하기
        int gap = m2 - m1;
        if(gap == 0){ //같은 월일때
            exclusive_day = d2 - d1; 
        }else if(gap >= 2){ //사이에 한개 이상의 달이 껴 있는 경우
            for(int i = 2; i < gap; i++){
                exclusive_day += countMonth(m1 + i - 1);
            }
            //m1 월의 최대일 - d1
            exclusive_day += countMonth(m1) - d1;
            exclusive_day += d2;
        }else if(gap == 1){
            //m1 월의 최대일 - d1
            exclusive_day += countMonth(m1) - d1;
            exclusive_day += d2;
        }
        return exclusive_day;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        //2월5일 ~ 4월 1일 : 몇 일 지나야 할까? (윤년 x)
        //2월 28, 홀수달 31, 짝수달 30 (8월 이전)
        //7월까진 홀수달이 31, 8월 31일 ~ 짝수달 31일
        //시작일 포함해서 날짜 계산

        int m1 = sc.nextInt(); //기준월
        int d1 = sc.nextInt(); //기준일
        int m2 = sc.nextInt(); //목표월
        int d2 = sc.nextInt(); //목표일

        int answer = exclusiveDay(m1, d1, m2, d2);
        System.out.println(answer);

    }
}