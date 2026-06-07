package org.example.level0;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        /*
        정수 배열 numbers가 매개변수로 주어집니다.
        numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
         */

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(solution(numbers));
    }

    static int solution(int[] numbers) {

        Arrays.sort(numbers);

        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }
}