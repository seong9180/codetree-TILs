import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = 0;
        double sum = 0;
        int cnt = 0;

        for(int i = 0 ; i <= 100; i++){
            year = sc.nextInt();

            if(year >29 || year <20){
                cnt = i;
                //System.out.println("i = " + i);
                //System.out.println("sum = " + sum);
                break;
            }

            sum += year;
        }

        double avg = sum / cnt;
        System.out.printf("%.2f",avg);
        
    }
}