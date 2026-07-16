package org.example.level0;

public class ConcatenateOddEven {
    public static void main(String[] args) {
        /*
        정수가 담긴 리스트 num_list가 주어집니다.
        num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
         */

        int[] num_list = {3, 4, 5, 2, 1};

        System.out.println(solution(num_list));
    }

    static int solution(int[] num_list) {

        String even = "";
        String odd = "";


        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }
        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}