import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count_three = 0, count_five = 0;

        for(int i = 0; i < 10; i++){
            int x = sc.nextInt();
            

            if(x % 3 == 0){
                count_three ++;
            }
            if(x % 5 == 0){
                count_five ++;
            }
        }

        System.out.print(count_three + " " + count_five);
    }
}