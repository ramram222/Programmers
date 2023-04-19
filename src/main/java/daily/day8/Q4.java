package daily.day8;

public class Q4 {
    // 순서쌍의 개수
    public static void main(String[] args) {
        int n = 100;
        System.out.println(solution(n));

    }
    public static int solution(int n) {
        int answer = 0;
        int num = 1;
        while (num <= n) {
            if (n % num == 0) {
                answer++;
            }
            num++;
        }
        return answer;
    }
}
