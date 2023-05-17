package daily.day12;

import java.util.Arrays;

public class Q2 {
    // 문자열 정렬하기 (1)
    public static void main(String[] args) {
        String myString = "hi1239";
        System.out.println(solution(myString));
    }
    public static int[] solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", "");

        int[] answer = new int[my_string.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_string.charAt(i) - '0';
        }

        Arrays.sort(answer);

        return answer;
    }
}
