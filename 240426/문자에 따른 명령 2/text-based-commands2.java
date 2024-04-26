import java.util.Scanner;


public class Main {
    
    static int[] dx = {0,1,0,-1}; //북동남서
    static int[] dy = {1,0,-1,0};
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        int x = 0;
        int y = 0;
        int dir_num = 0; //북

        Scanner sc = new Scanner(System.in);

        //int n = sc.nextInt();

        String dir = sc.nextLine();

        char[] command = {'L', 'R', 'F'};

        for(int i = 0; i < dir.length(); i++){
            if(dir.charAt(i) == 'L'){//반시계 90도
                dir_num = (dir_num -1 + 4) % 4;
            }else if(dir.charAt(i) == 'R'){//시계 90도
                dir_num = (dir_num + 1) % 4;
            }else{
                x += dx[dir_num];
                y += dy[dir_num];
            }
        }

        System.out.println(x + " " + y);
    }
}