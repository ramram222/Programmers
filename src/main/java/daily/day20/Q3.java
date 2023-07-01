package daily.day20;

public class Q3 {
    public static void main(String[] args) {
        // 최댓값 만들기 (2)
        int[] numbers = {0, -31, 24, 10, 1, 9};
        System.out.println(solution(numbers));

    }
    public static int solution(int[] numbers) {
        int answer = numbers[0] * numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int tmp = numbers[i] * numbers[j];
                if (tmp > answer) {
                    answer = tmp;
                }
            }
        }
        return answer;
    }
}
