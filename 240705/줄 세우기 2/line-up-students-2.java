//package study.codetree.mid.sort.instance;

import java.util.Arrays;
import java.util.Scanner;

/*
N명의 학생에 대해 키, 몸무게 정보가 주어졌을 때, 다음의 규칙에 따라 정렬하려고 합니다.

키가 더 작은 학생이 앞에 와야 합니다.

키가 동일하다면, 몸무게가 더 큰 학생이 앞에 와야 합니다.

키와 몸무게가 모두 동일한 경우는 주어지지 않는다고 가정해도 좋습니다.

번호는 정보가 따로 주어지진 않고 입력된 순서대로 부여됩니다.
즉 첫 번째로 입력된 학생은 1, k번째로 입력된 학생은 k입니다.
주어진 규칙에 따라 정렬한 이후 학생의 키, 몸무게, 번호를 출력하는 프로그램을 작성해보세요.
 */
class Student3 implements Comparable <Student3>{
    int height;
    int weight;
    int number;

    public Student3(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student3 student){
        // 키 >> 몸무게
        // 키 : 내림차순
        // 몸무게 : 오름차순
        if (this.height == student.height) {
            return student.weight - this.weight;
        }
        return this.height - student.height;
    }

    @Override
    public String toString() {
        return height + " " + weight + " " + number;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student3[] std = new Student3[n];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            int number = i + 1;

            std[i] = new Student3(height, weight, number);
        }

        Arrays.sort(std);
        for (Student3 student3 : std) {
            System.out.println(student3);
        }
    }
}