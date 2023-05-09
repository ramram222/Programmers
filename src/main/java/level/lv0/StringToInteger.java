package level.lv0;

public class StringToInteger {
    public static void main(String[] args) {
        // 문자열을 정수로 변환하기
        String n_str = "8542";
        System.out.println(solution(n_str));
    }
    public static int solution(String n_str) {
        int answer = Integer.parseInt(n_str);
        return answer;
    }
}
