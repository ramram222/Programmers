package daily.day8;

import java.util.Arrays;

public class Q3 {
    // 진료 순서 정하기
    public static void main(String[] args) {
        int[] emergency = {30, 10, 23, 6, 100};
        System.out.println(solution(emergency));
    }
    public static int[] solution(int[] emergency) {
        int[] copyArr = emergency.clone();
        int[] answer = new int[emergency.length];

        Arrays.sort(copyArr);

        for (int i = 0; i <= emergency.length - 1; i++) {
            for (int j = 0; j <= emergency.length - 1; j++) {
                if (copyArr[i] == emergency[j]) {
                    answer[j] = emergency.length - i;
                }
            }
        }


        return answer;
    }
}
