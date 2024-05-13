import java.util.*; //Scanner, Arrays, Collections

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //오름차순
        Arrays.sort(arr);

        for(int i = 0 ; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        //내림차순
        //1. int형 array 를 Integer로 변환
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        //2. Collections - reverseOrder 사용
        Arrays.sort(arr2, Collections.reverseOrder());

        for(int i = 0 ; i < n; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}