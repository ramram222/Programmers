package daily.day13;

import java.util.Arrays;

public class Q4 {
    // 삼각형의 완성조건 (1)
    public static void main(String[] args) {
        int[] sides = {1, 2, 3};
        System.out.println(solution(sides));
    }
    public static int solution(int[] sides) {
        int answer = 0;
        int max = Arrays.stream(sides).max().getAsInt();
        int totalLength = Arrays.stream(sides).sum();

        answer = totalLength - max > max ? 1 : 2;

        return answer;
    }
}
