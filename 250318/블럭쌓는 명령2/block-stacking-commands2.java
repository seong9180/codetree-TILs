import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] section = new int[N]; //블럭을 쌓을 구역

        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            for(int j = A - 1 ;j <= B - 1; j++){
                section[j]++;
            }
        }

        int max = section[0];
        for(int i = 0 ; i< N; i++){
            if(section[i] >= max){
                max = section[i];
            }
        }

        System.out.println(max);
        
    }
}