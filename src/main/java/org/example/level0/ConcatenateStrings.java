package org.example.level0;

import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        /*
        두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
        입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.

        입력 #1 : apple pen
        출력 #1 : applepen
         */

        Scanner s = new Scanner(System.in);

        String str1 = "apple";
        String str2 = "pen";

        System.out.println(str1 + str2);
    }
}