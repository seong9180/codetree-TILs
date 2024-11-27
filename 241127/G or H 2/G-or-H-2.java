import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] people = new int[n][2];

        for(int i = 0 ; i < n; i++){
            people[i][0] = sc.nextInt();
            people[i][1] = sc.next().equals("G") ? 1 : -1;
        }

        Arrays.sort(people, Comparator.comparingInt(o -> o[0]));

        int maxSize = 0;
        for(int i = 0 ; i< n ;i++){
            int gCount = 0;
            int hCount = 0;
            
            for(int j = i ; j < n; j++){
                if(people[j][1] == 1){
                    gCount ++;
                }else{
                    hCount ++;
                }

                if(gCount == hCount || gCount == 0 || hCount == 0){
                    int distance = people[j][0] - people[i][0];

                    maxSize = Math.max(distance,maxSize);
                }
            }

        }

        System.out.println(maxSize);
    }
}