package level.lv0;

public class MultiplyString {
    // 문자열 곱하기
    public static void main(String[] args) {
        String my_string = "string";
        int k = 3;
        System.out.println(solution(my_string, k));
    }
    public static String solution(String my_string, int k) {
        String answer = "";
        // answer = my_string.repeat(k);
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }
}
