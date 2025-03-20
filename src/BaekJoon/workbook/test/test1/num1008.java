package BaekJoon.workbook.test.test1;

import java.util.Scanner;

//A/B 성공스페셜 저지
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//2 초	128 MB	837011	284248	235185	34.524%
//문제
//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//출력
//첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
//
//예제 입력 1
//1 3
//예제 출력 1
//0.33333333333333333333333333333333
//10-9 이하의 오차를 허용한다는 말은 꼭 소수 9번째 자리까지만 출력하라는 뜻이 아니다.
//
//예제 입력 2
//4 5
//예제 출력 2
//0.8
public class num1008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        System.out.println((double)a / b);

    }
}

// a/b를 할 경우 정수 나눗셈(integer division)이 발생.
//따라서 a or b 중 하나를 double 타입으로 변환을 하여서
//float division(실수 나눗셈)이 되도록 하여야 ㅎ나다.
