import java.util.Scanner;

public class Main {
    public static int count = 0;
    public static int functionA(int n){
        if(n == 1){
            return count;
        }

        if(n % 2 == 0){ //짝수
            count ++;
            return functionA(n/2);
        }else{
            count ++;
            return functionA(n*3 + 1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = functionA(n);
        System.out.println(answer);
        
    }
}