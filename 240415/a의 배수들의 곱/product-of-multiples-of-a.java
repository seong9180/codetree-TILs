import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int mtx = 1; //배수들의 곱을 저장할 변수

        for(int i = 1; i <= b; i++){
            if(i % a == 0){
                mtx = mtx * i;
            }
        }

        System.out.println(mtx);
    }
}