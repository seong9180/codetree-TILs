import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int start = (11*24 + 11)*60 + 11;
        int end = (A*24 + B)*60 + C;
        
        if(start > end){
            System.out.println(-1);
        }else{
            System.out.println(end - start);
        }
    }
}