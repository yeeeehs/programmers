package org.example.level0;

public class ArrayAverage {
    public static void main(String[] args) {
        /*
        정수 배열 numbers가 매개변수로 주어집니다.
        numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
         */

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(solution(numbers));
    }

    static double solution(int[] numbers) {

        double answer = 0;

        for(int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        return answer / numbers.length;
    }
}
