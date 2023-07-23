package daily.day22;

public class Q1 {
    // 저주의 숫자 3
    public static void main(String[] args) {
        System.out.println(solution(15));
    }
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer++;
            while (String.valueOf(answer).contains("3") || answer % 3 == 0) {
                answer++;
            }
        }
        return answer;
    }
}
