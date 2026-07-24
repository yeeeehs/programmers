package org.example.level0;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        /*
        문자열 str이 주어집니다.
        문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.

        입력 #1 : abcde
        출력 #1 :  a
                  b
                  c
                  d
                  e
         */

        Scanner sc = new Scanner(System.in);
        String str = "abcde";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
