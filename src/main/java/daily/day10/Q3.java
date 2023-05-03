package daily.day10;

public class Q3 {
    public static void main(String[] args) {
        // 공 던지기
        int[] numbers = {1, 2, 3, 4};
        int k = 2;
        System.out.println(solution(numbers, k));
    }

    public static int solution(int[] numbers, int k) {
        int answer = numbers[2 * (k - 1) % numbers.length];
        return answer;
    }
}
