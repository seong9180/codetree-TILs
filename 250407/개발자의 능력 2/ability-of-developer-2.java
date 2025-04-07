import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;

        int[] abilities = new int[n];
        for(int i = 0 ;  i< n; i++){
            abilities[i] = sc.nextInt();
        }
        Arrays.sort(abilities);

        int[] combination = new int[n/2];

        for(int i = 0 ;  i< 3; i++){
            combination[i] = abilities[i] + abilities[n - i - 1];
        }

        int max = combination[0];
        int min = combination[2];

        for(int i = 0 ; i< 3; i++){
            if(combination[i] >= max){
                max = combination[i];
            }
            if(combination[i] <= min){
                min = combination[i];
            }
        }

        System.out.println(max - min);

    }

    
    
}