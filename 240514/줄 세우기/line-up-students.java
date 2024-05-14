//package study.codetree.samsung.object_sort;

import java.util.Arrays;
import java.util.Scanner;

class Student_2 implements Comparable<Student_2> {
    int height;
    int weight;
    int number;

    public Student_2() {
        int height = 0;
        int weight = 0;
        int number = 0;
    }

    public Student_2(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    public int compareTo(Student_2 student) {
        //키가 큰 순서 > 몸무게가 더 큰 순서 > 번호가 더 작은 순서
        //키 : 내림차순 || 몸무게 : 내림차순 || 번호 : 오름차순
        if (this.height == student.height) {
            if (this.weight == student.weight) {
                return this.number - student.number; //번호 오름차순
            }else {
                return student.weight - this.weight; //몸무게 내림차순
            }
        }else{
            return student.height - this.height; //키 내림차순
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student_2[] students = new Student_2[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student_2();
            students[i].height = sc.nextInt();
            students[i].weight = sc.nextInt();
            students[i].number = i + 1; //배열은 0부터 시작이라 번호 초기값 1에 맞춤
        }
        //System.out.println("--answer--");
        Arrays.sort(students);
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].height + " " + students[i].weight + " " + students[i].number);
        }
    }
}