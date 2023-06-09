package daily.day17;

public class Q3 {
    // 자릿수 더하기
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = 0;
        String[] numList = String.valueOf(n).split("");
        for (String num: numList) {
            answer += Integer.parseInt(num);
        }
        return answer;
    }
}
