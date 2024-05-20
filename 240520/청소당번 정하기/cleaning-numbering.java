import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count_classroom = 0, count_corridor = 0, count_bath = 0;

        for(int i = 0; i <= n; i++){
            if(i % 2 == 0 && i % 3 != 0&& i % 12 != 0){
                count_classroom ++;
            } else if(i % 3 == 0 && i % 12 != 0){
                count_corridor ++;
            } else if(i >= 12 && i % 12 == 0){
                count_bath ++;
            }
        }

        System.out.print(count_classroom + " " + count_corridor + " " + count_bath);
    }
}