package daily.day15;

import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        // 약수 구하기
        int n = 24;
        System.out.println(solution(n));
    }
    public static int[] solution(int n) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        answer = list.stream().mapToInt(
                i -> i).toArray();
        return answer;
    }

}
