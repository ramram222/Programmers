package daily.day6;

public class Q3 {
    // 짝수 홀수 개수
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(solution(num_list));
    }
    public static int[] solution(int[] num_list) {
        int even = 0;
        int odd = 0;
        for (int num: num_list) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int[] answer = {even, odd};
        return answer;
    }
}
