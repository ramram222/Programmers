package level.lv0;

public class EndOfString {
    // 문자열의 뒤의 n글자
    public static void main(String[] args) {
        String my_string = "He110W0r1d";
        int n = 5;
        System.out.println(solution(my_string, n));

    }
    public static String solution(String my_string, int n) {
        String answer = my_string.substring(my_string.length() - n);
        return answer;
    }
}
