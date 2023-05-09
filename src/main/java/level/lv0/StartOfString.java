package level.lv0;

public class StartOfString {
    // 문자열 앞의 n글자
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;
        System.out.println(solution(my_string, n));
    }
    public static String solution(String my_string, int n) {
        String answer = my_string.substring(0, n);
        return answer;
    }
}
