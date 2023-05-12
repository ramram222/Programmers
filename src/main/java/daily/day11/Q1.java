package daily.day11;

public class Q1 {
    public static void main(String[] args) {
        // 주사위의 개수
        int[] box = {10, 8, 6};
        int n = 3;
        System.out.println(solution(box, n));
    }
    public static int solution(int[] box, int n) {
        int answer = 1;
        for (int side: box) {
            answer *= side / n;
        }
        return answer;
    }
}
