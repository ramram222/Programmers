package daily.day7;

public class Q3 {
    // 양꼬치
    public static void main(String[] args) {
        int n = 64;
        int k = 6;
        System.out.println(solution(n, k));

    }
    public static int solution(int n, int k) {
        int lamb = 12000;
        int drink = 2000;
        int answer = (n * lamb) + (k * drink) - (drink * (n / 10));
        return answer;
    }
}
