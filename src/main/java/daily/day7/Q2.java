package daily.day7;

public class Q2 {
    // 각도기
    public static void main(String[] args) {
        int angle = 91;
        System.out.println(solution(angle));
    }
    public static int solution(int angle) {
        int answer = angle > 0 && angle < 90 ? 1
                : angle == 90 ? 2 : angle > 90 && angle < 180 ? 3
                : angle == 180 ? 4 : 0;
        return answer;
    }
}
