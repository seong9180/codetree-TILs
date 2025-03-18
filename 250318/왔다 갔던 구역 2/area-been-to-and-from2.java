import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int pos = 1000; // 좌우로 10 * 100 이동 가능하기 때문에 시작점을 1000으로 변경

        int[] line = new int[2001];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
    
            int newPos = (dir == 'L') ? pos - x : pos + x;
            int minPos = Math.min(pos, newPos);
            int maxPos = Math.max(pos, newPos);
    
            for(int j = minPos; j < maxPos; j++){
                line[j]++;
            }
            pos = newPos;
        }

        int cnt = 0; //2번 이상 지나긴 지역을 세는 변수
        for(int i  = 0 ; i < 2000; i++){
            if(line[i] >= 2){
                cnt++;
            }
        }
        // for(int i = 980; i < 1020; i++){
        //     System.out.print(line[i] + " ");
        // }

        System.out.println(cnt);
    }
}