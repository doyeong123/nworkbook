package BaekJoon.workbook.test.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

//곱셈 실패
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	128 MB	457022	212439	176466	46.441%
//문제
//(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//
//
//
//(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
//
//출력
//첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
//
//예제 입력 1
//472
//385
//예제 출력 1
//2360
//3776
//1416
//181720
public class num2588 {

    public static void main(String[] args) throws IOException {

        //방법 1

//        Scanner sc = new Scanner(System.in);
//
//        int x = sc.nextInt();
//        String y = sc.next();
//
//        sc.close();
//
//        System.out.println(x*(y.charAt(2) - '0'));
//        System.out.println(x*(y.charAt(1) - '0'));
//        System.out.println(x*(y.charAt(0) - '0'));
//        System.out.println(x* Integer.parseInt(y));

        //방법 2
//        Scanner sc = new Scanner(System.in);
//
//        int q = sc.nextInt();
//        int w = sc.nextInt();
//
//        System.out.println(q*(w%10));
//        System.out.println(q*(w%100/10));
//        System.out.println(q*(w%100));
//        System.out.println(q*w);

        //방법3

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();

        char[] b = B.toCharArray(); //해당 변수의 문자들을 인덱스 번호로 변수 b에 배열로 담아주는 메서드이다.

        System.out.println(A * (b[2] - '0'));
        System.out.println(A * (b[1] - '0'));
        System.out.println(A * (b[0] - '0'));

        System.out.println(A*Integer.parseInt(B));


    }

}
