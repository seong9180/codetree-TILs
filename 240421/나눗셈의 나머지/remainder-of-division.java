import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] cnt = new int[b];
        int sum = 0;

        while(true){
            int tmp_quo = 0;
            int tmp_rem = 0;

            tmp_rem = a % b; //나머지를 저장
            tmp_quo = a / b; //몫을 저장
            a = tmp_quo; //a 의 값을 이전 나눗셈의 몫으로 변경

            if(a <= 1){
                for(int i = 0; i <= b -1; i++){
                    if(tmp_rem == i){
                        cnt[i] ++;
                    }
                }
                break;
            }else{
                //System.out.println("tmp_rem 값은 : " + tmp_rem + " tmp_quo 값은" + tmp_quo);
                for(int i = 0; i <= b -1; i++){
                    if(tmp_rem == i){
                        cnt[i] ++;
                    }
                }
            }
        }
        
        for(int i = 0; i < b ; i++){
            sum += cnt[i] * cnt[i];
        }

        System.out.println(sum);
    }
}