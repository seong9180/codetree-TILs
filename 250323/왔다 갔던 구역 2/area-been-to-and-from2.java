import java.util.Scanner;
public class Main {
    public static void showTable(int[] arr, int pos){
        System.out.println("pos : " + pos);

        for (int i = pos - 5; i < pos + 5; i++) {
            if(i <= pos + 3){
                System.out.print(i + "|");
            }else{
                System.out.print(i);
            }
        }
        System.out.println();

        for(int i = pos - 5; i <pos + 5; i++){
            if(i == pos){
                System.out.print(" [" + arr[i] + "]" + "  ");
            }else{
                System.out.print(" " + arr[i] + "  ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //명령

        int range = 100 * 10 * 2;
        int pos = range / 2;
        int[] area = new int[range + 1];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            //겹치는 구역 : 우측으로 이동할 땐 끝점 카운트 x, 좌측으로 이동할 땐 시작점 카운트 x

            if(dir == 'L'){
                for(int j = pos - 1; j >= pos - x; j--){
                    area[j]++;
                }

                pos -= x;
                //showTable(area,pos);
            }else{
                for(int j = pos; j < pos + x; j++){
                    area[j]++;
                }
                //showTable(area, pos);
                pos += x;
            }
        }

        int visitedTwiceCount = 0;
        for(int i = 0 ; i <= range; i++){
            if(area[i] >= 2){
                visitedTwiceCount++;
            }
        }

        System.out.println(visitedTwiceCount);

    }
}