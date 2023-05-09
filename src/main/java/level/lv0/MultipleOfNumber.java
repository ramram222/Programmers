package level.lv0;

public class MultipleOfNumber {
    // n의 배수
    public static void main(String[] args) {
        int num = 98;
        int n = 2;
        System.out.println(solution(num, n));
    }
    public static int solution(int num, int n) {
        int answer = num % n == 0 ? 1 : 0;
        return answer;
    }
}
