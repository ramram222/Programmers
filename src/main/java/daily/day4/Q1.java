package daily.day4;

public class Q1 {
    // 피자 나눠 먹기 (1)
    public static void main(String[] args) {
        int n = 1;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = n % 7 == 0? n / 7 : n / 7 + 1;

        return answer;
    }
}
