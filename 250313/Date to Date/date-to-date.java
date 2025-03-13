import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};

        int startDate = d1, endDate = d2;
        for(int i = 0; i < m1 - 1; i++){
            startDate += month[i];
        }
        for(int i = 0; i < m2 - 1; i++){
            endDate += month[i];
        }
        // 시작일을 포함해야 하기 때문에 + 1 해야 함
        System.out.println(endDate - startDate + 1);
        
    }
}