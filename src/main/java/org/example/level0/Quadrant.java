package org.example.level0;

import java.util.Arrays;

public class Quadrant {
    public static void main(String[] args) {
        /*
        사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
         */

        int[] dot = {2, 4};

        System.out.println(solution(dot));
    }

    static int solution(int[] dot) {
        if (dot[0] > 0) return dot[1] > 0 ? 1 : 4;
        else return dot[1] > 0 ? 2 : 3;
    }
}