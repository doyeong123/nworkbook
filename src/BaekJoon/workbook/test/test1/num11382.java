package BaekJoon.workbook.test.test1;

import java.util.Scanner;

//꼬마 정민 실패
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	512 MB	272830	109095	97921	40.395%
//문제
//꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
//
//입력
//첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
//
//출력
//A+B+C의 값을 출력한다.
//
//예제 입력 1
//77 77 7777
//예제 출력 1
//7931
public class num11382 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //문제에서 제시한 범위를 Integer 타입은 표현이
        // 불가능하기 때문에 Long 타입을 사용한다.
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        sc.close();

        System.out.println(a+b+c);


    }
}
