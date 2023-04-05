package daily.day4;

public class Q2 {
    // 피자 나눠 먹기 (2)
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));

    }
    public static int solution(int n) {
        int answer = 1;
        int pizzaPcs = 6;
        while ((answer * pizzaPcs) % n != 0) {
            answer++;
        }
        return answer;
    }

}
