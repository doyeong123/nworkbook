package BaekJoon.workbook.test.test2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//윤년 실패
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	128 MB	440366	229134	189372	51.683%
//문제
//연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//
//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//
//예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
//
//입력
//첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
//
//출력
//첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
//
//예제 입력 1
//2000
//예제 출력 1
//1
//예제 입력 2
//1999
//예제 출력 2
//0
public class num2753 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int years = sc.nextInt();

        sc.close();

        if (years%4 ==0) {

            if (years % 400 == 0) {
                System.out.println("1");
            } else if (years % 100 == 0)
            {
                System.out.println("0");
            }
            else{
                System.out.println("1");
            }


        }
        else
        {
            System.out.println("0");
        }

    }

}
