package level.lv0;

public class PlusOverNumber {
    // n보다 커질 때까지 더하기
    public static void main(String[] args) {
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;
        System.out.println(solution(numbers, n));
    }
    public static int solution(int[] numbers, int n) {
        int answer = 0;
        for (int num : numbers) {
            answer += num;
            if(answer > n) break;
        }
        return answer;
    }
}
