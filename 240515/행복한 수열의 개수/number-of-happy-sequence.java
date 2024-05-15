//package study.codetree.samsung.exhaustive_search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = System.currentTimeMillis();

        int n = sc.nextInt(); // 1 ~ 100
        //행복한 수열 : 연속하게 m 개 이상의 동일한 원소가 나오는 순간이 존재하는 수열
        int m = sc.nextInt();
        int[][] grid = new int[n][n];
        int count = 0;

        if (n == 1 && m == 1) {
            System.out.println(2);
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            //함수 1 : 행을 기준으로 하는 수열 n 개
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    boolean check = false;
                    if (n == 1 && m == 1) {
                        check = true;
                        break;
                    } else if (j + m > n) {
                        i++;
                        break;
                    } else if (m > 1) {
                        for (int k = 1; k <= m; k++) {
                            if (j + k < n && grid[i][j] == grid[i][j + k]) {
                                check = true; //k (m) 범위 동안 모두 동일한 값을 가질 때만 true;
                                //System.out.println("for 1 : true, i,j,k = " + i + " " + j + " " + k);
                            } else {
                                check = false;
                                //System.out.println("for 1 : false, i,j,k = " + i + " " + j + " " + k);
                            }
                        }
                    } else if (m == 1) {
                        for (int k = 1; k <= m; k++) {
                            if (j + k < n && grid[i][j] != grid[i][j + k]) {
                                check = true; //m == 1 일때 '행복함' 조건을 만족하는 조합이 하나라도 있다면 true 이후 break;
                                //System.out.println("for 1 : true, i,j,k = " + i + " " + j + " " + k);
                                break;
                            }
                        }
                    }
                    if (check) { //check == true 이면 count++
                        count++;
                        //System.out.println("count = " + count);
                        break;
                    }
                }
            }
            //함수 2 : 열을 기준으로 하는 수열 n 개
        /*일반적으로 첫번째 포문의 변수를 i 두번째 포문의 변수를 j 로 설정.
        i == 2 일때 자꾸 out of bound 가 일어남.
        세로로 확인할 때는 인덱스 배치를 [i][j] 에서 [j][i] 로 바꾸거나 for문 변수 순서를 바꿔야 할 것 같았음.
         */
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n; i++) {
                    boolean check = false;
                    if (n == 1 && m == 1) {
                        check = true;
                        break;
                    } else if (i + m > n) {
                        j++;
                        break;
                    } else if (m > 1) {
                        for (int k = 1; k <= m; k++) {
                            if (i + k < n && grid[i][j] == grid[i + k][j]) {
                                check = true;
                                //System.out.println("for2 : true, i,j,k = " + i + " " + j + " " + k);
                            } else {
                                check = false;
                                //System.out.println("for2 : false, i,j,k = " + i + " " + j + " " + k);
                            }
                        }
                    } else if (m == 1) {
                        for (int k = 1; k <= m; k++) {
                            if (i + k < n && grid[i][j] != grid[i + k][j]) {
                                check = true;
                                //System.out.println("for2 : true, i,j,k = " + i + " " + j + " " + k);
                                break;
                            }
                        }
                    }
                    if (check) {
                        count++;
                        //System.out.println("count = " + count);
                        break;
                    }
                }
            }
            //함수 3 : 행복 한 수열의 개수를 세는 함수
            System.out.println(count);
            long end = System.currentTimeMillis();
            //System.out.println("수행시간: " + (end - start) + " ms");
        }
    }
}