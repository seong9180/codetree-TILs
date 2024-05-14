//package study.codetree.samsung.object_sort;

import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
    String name;
    int height;
    int weight;

    public Student() {
        this.name = "no data";
        this.height = 0;
        this.weight = 0;
    }
    public Student(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student) {
        if (this.height > student.height) {
            return 1;
        } else if (this.height < student.height) {
            return -1;
        } else {
            return 0;
        }
    }
    /* 더 간단하게 compareTo 작성
    public int compareTo(Student student) {
        return this.kor - student.kor;
     }
     */
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].name = sc.next();
            students[i].height = sc.nextInt();
            students[i].weight = sc.nextInt();
        }

        Arrays.sort(students);
        //Arrays.sort(students, (a,b) -> a.height - b.height); //no class overriding, no implement comparable

        //System.out.println("--answer--");
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].name + " " + students[i].height + " " + students[i].weight);
        }

    }
}