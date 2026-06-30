package org.example.level0;

public class IntegerPart {
    public static void main(String[] args) {
        /*
        실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
         */

        double num = 1.42;

        System.out.println(solution(num));
    }
    static int solution(double flo) {
        int answer = 0;
        return (int) flo;
    }
}