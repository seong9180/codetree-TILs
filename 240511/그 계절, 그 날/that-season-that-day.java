//package study.codetree.mid.function;

import java.util.*;

public class Main {
    public static boolean isLeapYear(int y){
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                return y % 400 == 0;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void whatSeason(int y, int m, int d) {
        if(isLeapYear(y)){//윤년이라면
            if (m == 1) {
                if(d > 31){
                    System.out.println(-1);
                }else{
                    System.out.println("Winter");
                }
            } else if (m == 2) {
                if(d > 29){
                    System.out.println(-1);
                }else{
                    System.out.println("Winter");
                }
            } else if (m == 3) {
                if(d > 31){
                    System.out.println(-1);
                }else{
                    System.out.println("Spring");
                }
            } else if (m == 4) {
                if(d > 30){
                    System.out.println(-1);
                }else{
                    System.out.println("Spring");
                }
            } else if (m == 5) {
                if(d > 31){
                    System.out.println(-1);
                }else{
                    System.out.println("Spring");
                }
            } else if (m == 6) {
                if(d > 30){
                    System.out.println(-1);
                }else{
                    System.out.println("Summer");
                }
            } else if (m == 7) {
                if(d > 31){
                    System.out.println(-1);
                }else{
                    System.out.println("Summer");
                }
            } else if (m == 8) {
                if(d > 31){
                    System.out.println(-1);
                }else{
                    System.out.println("Summer");
                }
            } else if (m == 9) {
                if(d > 31){
                    System.out.println(-1);
                }else{
                    System.out.println("Fall");
                }
            } else if (m == 10) {
                if(d > 30){
                    System.out.println(-1);
                }else{
                    System.out.println("Fall");
                }
            } else if (m == 11) {
                if(d > 30){
                    System.out.println(-1);
                }else{
                    System.out.println("Fall");
                }
            } else {
                if(d > 31){
                    System.out.println(-1);
                }else{
                    System.out.println("Winter");
                }
            }

        }else{ //윤년이 아니라면
            if (m == 1) {
                if(d > 31){
                    System.out.println(-1);
                }else{
                    System.out.println("Winter");
                }
            } else if (m == 2) {
                if(d > 28){
                    System.out.println(-1);
                }else{
                    System.out.println("Winter");
                }
            } else if (m == 3) {
                if(d > 31){
                    System.out.println(-1);
                }else{
                    System.out.println("Spring");
                }
            } else if (m == 4) {
                if(d > 30){
                    System.out.println(-1);
                }else{
                    System.out.println("Spring");
                }
            } else if (m == 5) {
                if(d > 31){
                    System.out.println(-1);
                }else{
                    System.out.println("Spring");
                }
            } else if (m == 6) {
                if(d > 30){
                    System.out.println(-1);
                }else{
                    System.out.println("Summer");
                }
            } else if (m == 7) {
                if(d > 31){
                    System.out.println(-1);
                }else{
                    System.out.println("Summer");
                }
            } else if (m == 8) {
                if(d > 31){
                    System.out.println(-1);
                }else{
                    System.out.println("Summer");
                }
            } else if (m == 9) {
                if(d > 31){
                    System.out.println(-1);
                }else{
                    System.out.println("Fall");
                }
            } else if (m == 10) {
                if(d > 30){
                    System.out.println(-1);
                }else{
                    System.out.println("Fall");
                }
            } else if (m == 11) {
                if(d > 30){
                    System.out.println(-1);
                }else{
                    System.out.println("Fall");
                }
            } else {
                if (d > 31) {
                    System.out.println(-1);
                } else {
                    System.out.println("Winter");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        whatSeason(y,m,d);
    }
}