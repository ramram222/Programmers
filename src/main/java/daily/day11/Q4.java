package daily.day11;

public class Q4 {
    // 팩토리얼
    public static void main(String[] args) {
        int n = 7;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n >= factorial(i)) {
                answer = i;
            } else {
                break;
            }
        }
        return answer;
    }
    public static int factorial(int n) {
        if (n > 1) return n *factorial(n - 1);
        return n;
    }
}
