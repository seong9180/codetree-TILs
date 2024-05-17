import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for(int i = 1; i <500; i++){
            if(count == 5){
                break;
            }
            System.out.print(i * n + " ");
            count ++;
        }
    }
}