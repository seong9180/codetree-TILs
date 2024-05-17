import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] isCold = new char[3];
        int[] temp = new int[3];

        for(int i = 0; i < 3; i++){
            isCold[i] = sc.next().charAt(0);
            temp[i] = sc.nextInt();
        }

        int counta = 0;
        int countb = 0;
        int countc = 0;
        int countd = 0;

        for(int i = 0 ; i < 3; i++){
            if(isCold[i] == 'Y' && temp[i] >= 37){
                counta ++;
            }else if(isCold[i] == 'N' && temp[i] >= 37){
                countb ++;
            }else if(isCold[i] == 'Y' && temp[i] < 37){
                countc ++;
            }else{
                countd ++;
            }
        }

        if(counta >= 2){
            System.out.println("E");
        }else{
            System.out.println("N");
        }
    }
}