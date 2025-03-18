import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int[] line = new int[200];
        for (int i = 0; i < n; i++) {
            //범위가 -100 ~ 100 이라서 + 100을 offset 으로 설정
            x1[i] = sc.nextInt() + 100;
            x2[i] = sc.nextInt() + 100;
            for(int j = x1[i]; j < x2[i] ; j++){
                line[j]++;
            }
        }
        
        int max = line[0];
        for(int i = 0 ; i< 200; i++){
            if(line[i] >= max){
                max = line[i];
            }
        }

        System.out.println(max);

    }
}