package daily.day14;

public class Q3 {
    // 암호 해독
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        System.out.println(solution(cipher, code));
    }
    public static String solution(String cipher, int code) {
        String answer = "";
        for (int i = 1; i <= cipher.length(); i++) {
            if (i % code == 0) {
                answer += cipher.charAt(i - 1);
            }
        }
        return answer;
    }
}
