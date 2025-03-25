import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arange = 1000 * 100;

        int[] tile = new int[arange + 1]; //기본 상태 0
        int pos = arange / 2; //start point

        //left -> 1 right -> 2

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'R'){
                for(int j = pos; j < pos + x; j++){ //현재 위치 타일 포함 X 칸
                    tile[j] = 2; //black
                }
                pos += (x - 1);
            }else{
                for(int j = pos; j > pos - x; j--){
                    tile[j] = 1; //white
                }
                pos -= (x - 1);
            }            
        }

        int countWhite = 0, countBlack = 0;
        for(int i = 0 ; i <= arange; i++){
            if(tile[i] == 1){
                countWhite++;
            }else if(tile[i] ==2){
                countBlack++;
            }
        }

        System.out.println(countWhite + " " + countBlack);
    }
}