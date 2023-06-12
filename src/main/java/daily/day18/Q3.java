package daily.day18;

public class Q3 {
    // 세균 증식
    public static void main(String[] args) {
        int n = 7;
        int t = 15;
        System.out.println(solution(n, t));
    }
    public static int solution(int n, int t) {
        int answer = n;
        for (int i = 1; i <= t; i++) {
            answer = answer * 2;
        }
        return answer;
    }
}
