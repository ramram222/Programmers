package daily.day18;

public class Q2 {
    public static void main(String[] args) {
        // 제곱수 판별하기
        int n = 976;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (Math.pow(i, 2) == n) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}
