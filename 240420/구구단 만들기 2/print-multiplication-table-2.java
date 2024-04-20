import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < 4; i++){
            for(int j = b; j >= a; j--){
                System.out.print(j + " * " + 2*(i+1) + " = " + (j*2*(i+1)));
                if(j > a){
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
        
    }
}