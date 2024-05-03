import java.util.Scanner;

public class Main {
    public static void printSquare(int n){
        int start_number = 1;
        for(int i = 0 ; i < n; i ++){
            for(int j = 0; j < n; j++){
                System.out.print(start_number + " ");

                if(start_number == 9){
                    start_number = 1;
                }else{
                    start_number ++;
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printSquare(n);
    }
}