package daily.day9;

public class Q1 {
    // 개미 군단
    public static void main(String[] args) {
        int hp = 999;
        System.out.println(solution(hp));

    }
    public static int solution(int hp) {
        int answer = hp / 5;
        hp %= 5;

        answer += hp / 3;
        hp %= 3;

        answer += hp / 1;

        return answer;
    }
}
