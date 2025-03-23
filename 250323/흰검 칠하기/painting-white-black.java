import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //흰색 1 검은색 2 회색 3
        int range = 1000 * 100 * 2;
        int[] tile = new int[range + 2];
        int[] tileToWhite = new int[range + 2];
        int[] tileToBlack = new int[range + 2];
        int[] tileToGray = new int[range + 2];

        int startPos = range/2;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            //현재 타일 위치 tile[startPos]
            if(d == 'L'){
                for(int j = startPos; j > startPos - x; j--){
                    //한칸 더 흰색으로 칠해서 회색으로 변할 수 있는 타일이거나, 이미 회색 타일인 경우 > 흰색 카운트 증가 x
                    if(tileToWhite[j] == 1 && tileToBlack[j] >= 2 && tileToGray[j] == 0){
                        tileToGray[j] = 1;
                        tile[j] = 3; //회색 타일로 변경
                    }else if(tileToGray[j] == 1){ //이미 회색 타일인 경우
                        tile[j] = 3;
                    }else{
                        tileToWhite[j]++;
                        tile[j] = 1; //흰색 타일로 변경
                    }
                }
                startPos -= (x - 1);
            }else{
                for(int j = startPos; j < startPos + x; j++){
                    //한칸 더 흰색으로 칠해서 회색으로 변할 수 있는 타일이거나, 이미 회색 타일인 경우 > 검은색 카운트 증가 x
                    if(tileToWhite[j] >= 2 && tileToBlack[j] == 1 && tileToGray[j] == 0){
                        tileToGray[j] = 1;
                        tile[j] = 3; //회색 타일로 변경
                    }else if(tileToGray[j] == 1){ //이미 회색 타일인 경우
                        tile[j] = 3;
                    }else{
                        tileToBlack[j]++;
                        tile[j] = 2; //검은색 타일로 변경
                    }
                }
                startPos += (x - 1);
            }
        }

        //타일 수 세기
        int white = 0, black = 0, gray = 0;

        for(int i = 0; i < range + 2; i++){
            if(tile[i] == 1){
                white ++;
            }else if(tile[i] == 2){
                black ++;
            }else if(tile[i] == 3){
                gray ++;
            }
        }

        System.out.println(white + " " + black + " " + gray);

    }
}