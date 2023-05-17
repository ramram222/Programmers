package daily.day12;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Q4 {
    // 소인수분해
    public static void main(String[] args) {
        int n = 420;
        System.out.println(solution(n));
    }
    public static int[] solution(int n) {
        LinkedHashSet<Integer> tmp = new LinkedHashSet<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                tmp.add(i);
                n /= i;
            }
        }

        int[] answer = Arrays.stream(tmp.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
