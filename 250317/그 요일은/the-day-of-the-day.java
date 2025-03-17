import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next(); //A요일
        
        int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
        int startDate = 0;
        for(int i = 0; i < m1 - 1; i++){
            startDate += months[i];
        }
        startDate += d1;
        int endDate = 0;
        for(int i = 0; i < m2 - 1; i++){
            endDate += months[i];
        }
        endDate += d2;
        
        int dateGap = endDate - startDate;
        int totalDays = dateGap + 1; //시작일 포함 총 일수
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        // EX) 53일 차이 남. 53 / 7 = 7*7 + 4 =? 모든 요일 7 번 반복 + 앞의 4번째 요일까지 한번 더 등장.
        // dateGap % 7 = > 요일의 인덱스

        int aIndex = 0;
        for(int i = 0 ; i < 7 ;i++){
            if(A.equals(days[i])){ //문자열끼리 비교는 .equals() 를 사용해야 함!
                aIndex = i;
                break;
            }
        }

        // System.out.println("startDate = " + startDate);
        // System.out.println("endDate = " + endDate);
        // System.out.println("dateGap = " + dateGap);
        // System.out.println("aIndex = " + aIndex);
        // System.out.println("totalDays % 7 = " + (totalDays % 7));


        int daysCount = 0; // A요일이 몇번 등장하는지 카운트
        if(totalDays % 7 > aIndex){//배열 인덱스라 4번째면 인덱스상 3
        //totalDays % 7 >> 단순한 나머지기 떄문에 1부터 시작하는 값임. 
        //EX) totayDays & 7 == 6 이 나왔다면 6번쨰 요일인 토요일.
        //반면, aIndex는 배열값이기 때문에 0부터 시작하는 값. 
        //aIndex = 5 라면, 0.1.2.3.4.5 즉 6번째 요일인 토요일.
        //언뜻 보면 totalDays % 7 >= aIndex 라고 생각 했었는데, > 가 맞는 범위임. (인덱스와 비 인덱스 값의 차이)
            daysCount = totalDays / 7 + 1;
        }else{
            daysCount = totalDays / 7;
        }

        System.out.println(daysCount);

    }
}