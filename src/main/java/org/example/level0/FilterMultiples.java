package org.example.level0;

import java.util.Arrays;

public class FilterMultiples {
    public static void main(String[] args) {
        /*
        정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
        numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
         */

        int n = 3;
        int[] num_list = {4,5,6,7,8,9,10,11,12};

        System.out.println(Arrays.toString(solution(n, num_list)));
    }

    static int[] solution(int n, int[] numlist) {
        int answer = 0;

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer++;
            }
        }

        int result[] = new int[answer];

        int k = 0;

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                result[k] = numlist[i];
                k++;
            }
        }
        return result;
    }
}
