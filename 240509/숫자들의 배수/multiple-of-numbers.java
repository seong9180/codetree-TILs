import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for(int i = 1 ; i <= 10; i++){
            if((n * i) % 5 == 0){
                count ++;
            }
            System.out.print(n*i + " ");

            if(count == 2){
                break;
            }
        }
        
    }
}