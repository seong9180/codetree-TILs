import java.util.Scanner;

public class Main {

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //4
        
        int x = 0;
        int y = 0;

        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dir_num;
            
            int move_count = sc.nextInt();

            if(dir == 'N'){
                dir_num = 3;
                //y += move_count;
            }else if(dir == 'S'){
                dir_num = 2;
                //y -= move_count;
            }else if(dir == 'E'){
                dir_num = 0;
                //x += move_count;
            }else{
                dir_num = 1;
                //x -= move_count;            
            }

            x += dx[dir_num] * move_count;
            y += dy[dir_num] * move_count;
        }

        System.out.println(x + " " + y);
    }
}