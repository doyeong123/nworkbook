package BaekJoon.workbook.test.test1;

import java.util.Scanner;

//??! 성공
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	256 MB	328590	164164	140374	50.367%
//문제
//준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 준하는 놀람을 ??!로 표현한다. 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는
// 프로그램을 작성하시오.
//
//입력
//첫째 줄에 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어진다. 아이디는 알파벳 소문자로만 이루어져 있으며, 길이는 50자를 넘지 않는다.
//
//출력
//첫째 줄에 준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.
//
//예제 입력 1
//joonas
//예제 출력 1
//joonas??!
//예제 입력 2
//baekjoon
//예제 출력 2
//baekjoon??!
public class num10926 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = "??!";

        String x = sc.nextLine();

        sc.close();

        System.out.println(x + s);
    }

}
