package daily.day3;

import java.util.Arrays;

public class Q4 {
    // 짝수는 싫어요
    public static void main(String[] args) {
        int n = 15;
        System.out.println(Arrays.toString(solution(n)));
    }
    public static int[] solution(int n) {
        int length = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] answer = new int[length];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}
