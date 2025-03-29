import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();

        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();

        // 방법1)
        // 1. 한 변 덮기
        // 2. 한 점 덮기
        // 3. 완전히 덮기
        // 4. 하나도 덮지 않기

        // 방법2)
        // 첫번째 직사각형 1로 채우기
        // 두번쨰 직사각형 2로 채우기
        // 첫번째와 두번째 직사각형이 겹칠 때, 3으로 채우기

        //OFFSET + 1000
        rect1_x1 += 1000;
        rect1_x2 += 1000;
        rect1_y1 += 1000;
        rect1_y2 += 1000;
        rect2_x1 += 1000;
        rect2_x2 += 1000;
        rect2_y1 += 1000;
        rect2_y2 += 1000;

        int[][] arr = new int[2000][2000];

        for(int i = rect1_x1; i < rect1_x2; i++){
            for(int j = rect1_y1; j < rect1_y2; j++){
                arr[i][j] = 1;
            }
        }

        for(int i = rect2_x1; i < rect2_x2; i++){
            for(int j = rect2_y1; j < rect2_y2; j++){
                if(arr[i][j] == 1){ //직사각형 1과 겹치면,
                    arr[i][j] = 3; //값을 3으로 변경
                }else{
                    arr[i][j] = 2;//
                }
            }
        }
        
        int x1Max = 0, y1Max = 0;
        int x1Min = 2000, y1Min = 2000;
        int remainAcount = 0; //남은 a 사각형의 크기를 카운트, 0 이라면 잔해물이 없다는 의미.

        for(int i  = 0; i < 2000; i++){
            for(int j = 0; j < 2000; j++){
                if(arr[i][j] == 1){
                    remainAcount++;
                    if(i >= x1Max){
                        x1Max = i;
                        //System.out.println("i = " + i + " , x1Max = " + x1Max);
                    }
                    if(j >= y1Max){
                        y1Max = j;
                        //System.out.println("j = " + j + " , y1Max = " + y1Max);
                    }
                    if(i <= x1Min){
                        x1Min = i;
                        //System.out.println("i = " + i + " , y1Max = " + y1Max);
                    }
                    if(j <= y1Min){
                        y1Min = j;
                        //System.out.println("j = " + j + " , y1Min = " + y1Min);
                    }
                }
            }
            //System.out.println("----------");
        }

        if(remainAcount > 0){
            // 배열 인덱스 상 차이를 구하면 사각형의 변 길이 -1 로 적용됨.
            int newRecX = x1Max - x1Min + 1;
            int newRecY = y1Max - y1Min + 1;

            //System.out.println("newRecX = " + newRecX + " newRecY = " + newRecY);
            System.out.println(newRecX * newRecY);
        }else{
            //System.out.println("A가 B에 온전히 포함되는 경우");
            System.out.println(0);
        }
        
        
    
    }
}