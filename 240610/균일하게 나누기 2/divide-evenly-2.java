import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] x = new int[N];
        int[] y = new int[N];
        
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        int result = N;
        
        for (int xi = 0; xi < N; xi++) {
            for (int yi = 0; yi < N; yi++) {
                int a = x[xi] + 1;  // 짝수로 만들기 위해 +1
                int b = y[yi] + 1;  // 짝수로 만들기 위해 +1
                
                int q1 = 0, q2 = 0, q3 = 0, q4 = 0;
                
                for (int i = 0; i < N; i++) {
                    if (x[i] < a && y[i] < b) q1++;
                    else if (x[i] < a && y[i] > b) q2++;
                    else if (x[i] > a && y[i] < b) q3++;
                    else if (x[i] > a && y[i] > b) q4++;
                }
                
                int maxRegion = Math.max(Math.max(q1, q2), Math.max(q3, q4));
                result = Math.min(result, maxRegion);
            }
        }
        
        System.out.println(result);
    }
}