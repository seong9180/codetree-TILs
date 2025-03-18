import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int pos = 1000; // 좌우로 10 * 100 이동 가능하기 때문에 시작점을 1000으로 변경

        int[] line = new int[2000];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            
            if(dir == 'L'){//left == minus 
                for(int j = pos - 1; j >= pos - x; j--){ //시작점 중복을 피하기 위해 -1부터 카운트
                    line[j]++;
                }
                pos -= x;
            }else{//right == plus
                for(int j = pos + 1; j <= pos + x; j++){ //시작점 중복을 피하기 위해 +1부터 카운트
                    line[j]++;
                }
                pos += x;
            }
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