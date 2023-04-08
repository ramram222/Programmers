package daily.day6;

public class Q1 {
    // 문자열 뒤집기
    public static void main(String[] args) {
        String my_string = "jaron";
        System.out.println(solution(my_string));
    }
    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        String answer = sb.reverse().toString();
        return answer;
    }
}
