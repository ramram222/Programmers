package daily.day16;

import java.util.Arrays;

public class Q2 {
    // 가장 큰 수 찾기
    public static void main(String[] args) {
        int[] array = {1, 8, 3};
        System.out.println(solution(array));
    }
    public static int[] solution(int[] array) {
        int[] answer = new int[2];

        answer[0] = Arrays.stream(array).max().getAsInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == answer[0]) {
                answer[1] = i;
            }
        }

        return answer;
    }
}
