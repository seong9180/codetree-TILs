import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr= new int[2][4];
        double sum = 0;

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }

        for(int i = 0; i < 2; i++){
            double sum_vertical = 0;
            for(int j = 0; j < 4; j++){
                sum_vertical += arr[i][j];
            }
            System.out.printf("%.1f",sum_vertical/4);
            System.out.print(" ");
        }
        System.out.println();

        for(int i = 0; i < 4; i++){
            double sum_horizontal = 0;
            /*
            [0][0] [0][1] [0][2] [0][3]
            [1][0] [1][1] [1][2] [1][3]
            */
            for(int j = 0; j < 2; j++){ // [0][0] + [1][0]
                sum_horizontal += arr[j][i];
            }
            System.out.printf("%.1f",sum_horizontal/2);
            System.out.print(" ");
        }
        System.out.println();

        System.out.printf("%.1f", sum/8);
    }
}