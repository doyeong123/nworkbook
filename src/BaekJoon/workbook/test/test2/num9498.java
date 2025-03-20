package BaekJoon.workbook.test.test2;

import java.sql.SQLOutput;
import java.util.Scanner;

//시험 성적 실패
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	128 MB	465565	254317	212297	54.791%
//문제
//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//
//출력
//시험 성적을 출력한다.
//
//예제 입력 1
//100
//예제 출력 1
//A
public class num9498 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x>=90) {
            System.out.println("A");
        } else if (x>=80) {
            System.out.println("B");
        } else if (x>=70) {
            System.out.println("C");
        } else if (x >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }



    }
}
