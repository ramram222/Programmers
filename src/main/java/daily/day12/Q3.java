package daily.day12;

public class Q3 {
    // 숨어있는 숫자의 덧셈 (1)
    public static void main(String[] args) {
        String myString = "aAb1B2cC34oOp";
        System.out.println(solution(myString));
    }
    public static int solution(String my_string) {
        int answer = 0;

        my_string = my_string.replaceAll("[^0-9]", "");

        for (int i = 0; i < my_string.length(); i++) {
            answer += my_string.charAt(i) - '0';
        }

        return answer;
    }

}
