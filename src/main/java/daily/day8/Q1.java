package daily.day8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        System.out.println(solution(numbers, num1, num2));

    }
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
//        int[] answer = IntStream.range(num1, num2 + 1).map(i -> numbers[i]).toArray();
        return answer;
    }
}
