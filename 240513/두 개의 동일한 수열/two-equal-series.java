import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i = 0 ; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n; i++){
            arr2[i] = sc.nextInt();
        }

        boolean same = true;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0 ; i < n; i++){
            if(arr1[i] != arr2[i]){
                same = false;
                break;
            }
        }

        if(same == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}