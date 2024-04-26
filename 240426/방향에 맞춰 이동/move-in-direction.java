import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //4

        int x = 0;
        int y = 0;

        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int move_count = sc.nextInt();

            if(dir == 'N'){
                y += move_count;
            }else if(dir == 'S'){
                y -= move_count;
            }else if(dir == 'E'){
                x += move_count;
            }else{
                x -= move_count;
            }
        }

        System.out.println(x + " " + y);
    }
}