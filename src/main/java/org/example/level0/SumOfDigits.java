package org.example.level0;

public class SumOfDigits {
    public static void main(String[] args) {
        /*
        정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요.
         */

        int n = 1234;

        System.out.println(solution(n));
    }

    static int solution(int n) {
        String str = Integer.toString(n);
        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) - '0';
        }

        return answer;
    }
}