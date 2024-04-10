public class Main {
    public static void main(String[] args) {
        double a = 5.26;
        double b = 8.27;
        //자료형에 대한 공부도 다시 진행해야 할 것 같다.

        //System.out.println(a*b);// 소수점 셋째 자리까지만 출력하는 법?
        //System.out.println(Math.round((a*b)*10.0)/10.0);
        //System.out.println(Math.round((a*b)*100.0)/100.0);
        //System.out.println(Math.round((a*b)*1000.0)/1000.0);
        //System.out.println(String.format("%,.2f", a*b));
        System.out.println(String.format("%,.3f", a*b));
        /*
        소숫점 n 번쨰 자리까지 출력하는 법
        1. [Math.round]
        Math.round : 반올림 (ceil : 올림 / floor : 버림)
        소숫점 셋째 자리에서 반올림하고 싶은 경우
        -> (number * 1000.0)/1000.0

        ***Math.round 방식은 소수점 아래 0 부분을 절삭하여 표현함.

        2.[String format]
        print 문 내부에 String.format("%,.nf" , number) 를 추가하면 된다. 
        *n = 원하는 소숫점 아래 위치

        ***Math.round 와 다르게 소수점 아래 0 부분을 절삭하지 않음.

        */

    }
}