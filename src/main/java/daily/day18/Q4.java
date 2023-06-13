package daily.day18;

import java.util.Arrays;

public class Q4 {
    // 문자열 정렬하기 (2)
    public static void main(String[] args) {
        String my_string = "Bcad";
        System.out.println(solution(my_string));
    }
    public static String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.toLowerCase().split("");

        Arrays.sort(arr);

        for (String s : arr) {
            answer += s;
        }

        return answer;
    }
}
