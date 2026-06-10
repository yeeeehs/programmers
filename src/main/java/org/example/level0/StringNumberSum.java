package org.example.level0;

public class StringNumberSum {
    public static void main(String[] args) {
        /*
        문자열 my_string이 매개변수로 주어집니다.
        my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
         */

        String my_string = "aAb1B2cC34oOp";

        System.out.println(solution(my_string));
    }

    static int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);

            if (a >= '0' && a <= '9') {
                answer += (a - '0');
            }
        }
        return answer;
    }
}