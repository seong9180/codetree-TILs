import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] car_price = new int[n];
        for(int i = 0 ; i < n; i++){
            car_price[i] = sc.nextInt();
        }

        int totalMax = 0;
        int max = 0;
        for(int i = n - 1; i >= 0; i--){ //4,3,2,1,0
            for(int j = 0; j < i; j++){ //0,1,2,3
                if(car_price[i] - car_price[j] >= totalMax){
                    totalMax = car_price[i] - car_price[j];
                }
            }
        }
        
        if(totalMax > 0){
            System.out.println(totalMax);
        }else{
            System.out.println(0);
        }

    }
}