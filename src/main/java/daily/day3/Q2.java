package daily.day3;

import java.util.Arrays;

public class Q2 {
    // 중앙값 구하기
    public static void main(String[] args) {
        int[] array = {9, -1, 0};
        System.out.println(solution(array));
    }
    public static int solution(int[] array) {
        Arrays.sort(array);
        int middle = array.length/2;
        int answer = array[middle];

        return answer;
    }
}
