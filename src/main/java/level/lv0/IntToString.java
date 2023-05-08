package level.lv0;

public class IntToString {
    // 문자열로 변환
    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));
    }
    public static String solution(int n) {
        // Integer.toString(n);
        String answer = String.valueOf(n);
        return answer;
    }
}
