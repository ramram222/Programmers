package daily.day17;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    // n의 배수 고르기
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(solution(n, numlist));
    }
    public static int[] solution(int n, int[] numlist) {
        // Arrays.stream(numlist).filter(value -> value % n == 0).toArray();
        List<Integer> list = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) {
                list.add(num);
            }
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
