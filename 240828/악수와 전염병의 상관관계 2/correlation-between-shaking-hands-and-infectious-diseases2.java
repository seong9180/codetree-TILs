//package NoviceMid.Simulation2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 총 개발자 수
        int k = sc.nextInt(); //전염병 옮기기 가능한 횟수
        int p = sc.nextInt(); // 처음 전염병에 걸린 개발자 넘버
        int t = sc.nextInt(); // 악수 순서쌍 갯수

        int[] timeline = new int[251]; //1~250 까지의 인덱스를 모두 채우기 위해. 인덱스 0 은 무시.
        int[] developersInfected = new int[n + 1]; //감염 여부 표시하는 배열. 인덱스 0은 무시하고 dev[n] 까지 값 배치
        developersInfected[p] = 1; //처음 걸린 개발자 1 나머지 0
        int[] developersCount = new int[n + 1]; //악수 전파 횟수 카운트 배열
        //developersInfected[p] = 1;

//        개발자 N 명
//        T 번에 걸쳐서 : 악수 매치업
//        k 번 악수 이후 전염병 옮기지 않음.
//                감염자들끼리 악수 해도 전염 옮기기 횟수 +
//
//                0 -> 음성
//        1 -> 양성
//        개발자 {0, 1}

        int[] inputX = new int[251];
        int[] inputY = new int[251];
        //시간 순서 == 인덱스 (안에 값은 X,Y 넘버)

        for (int i = 0; i < t; i++) {
            int time = sc.nextInt();
            int x = sc.nextInt(); //개발자 x
            int y = sc.nextInt(); //개발자 y

            inputX[time] = x;
            inputY[time] = y;
        }

        for (int i = 0; i < 251; i++) {
            if (inputX[i] != 0) { //값이 0이 아니면 = INPUT 으로 받은 악수쌍을 시간순으로 정리한 것. (x,y 인덱스는 동일)
                int x = inputX[i];
                int y = inputY[i];

                if ((developersInfected[x] == 1 && developersCount[x] < k) || (developersInfected[y] == 1 && developersCount[y] < k)) { //둘 중 하나가 횟수가 남은 감염자라면
                    if (developersInfected[x] != 1 || developersInfected[y] != 1) { // 둘 중 하나가 감염자가 아니라면
                        if (developersInfected[x] == 0) { //x 가 멀쩡, y 가 감염자라면
                            developersInfected[x] = 1;
                            developersCount[y] ++; //y 는 감염자라 횟수 카운트 증가
                        } else { //X 가 감염자, Y 가 멀쩡하다면
                            developersInfected[y] = 1;
                            developersCount[x] ++;
                        }
                    } else { //둘다 이미 감염자였다면
                        //악수 횟수만 증가
                        developersCount[x]++;
                        developersCount[y]++;
                    }
                } else if ((developersInfected[x] == 1 && developersCount[x] >= k) || (developersInfected[y] == 1 && developersCount[y] >= k)) { //둘 중 하나가 악수 전염 횟수가 다 된 감염자라면
                    //악수 횟수만 증가
                    developersCount[x]++;
                    developersCount[y]++;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(developersInfected[i]);
        }
    }
}