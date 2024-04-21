import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt_2 = 0; //2가 등장한 횟수를 저장하는 변수

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 2){
                cnt_2 ++;
                if(cnt_2 == 3){
                    System.out.print(i+1); //배열은 0 번째부터 시작, 따라서 i + 1 이 올바른 순서
                }
            }
        }
        
    }
}