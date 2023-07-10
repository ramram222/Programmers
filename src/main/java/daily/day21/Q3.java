package daily.day21;

import java.util.Arrays;

public class Q3 {
    // 삼각형의 완성조건 (2)
    public static void main(String[] args) {
        int[] sides = {3 ,6};
        System.out.println(solution(sides));
    }
    public static int solution(int[] sides) {
        int answer = 0;
        // int max = Math.max(sides[0], sides[1]);
        // int min = Math.min(sides[0], sides[1]);
        int bNum = Arrays.stream(sides).max().getAsInt();
        int sNum = Arrays.stream(sides).min().getAsInt();

        for (int i = 1; i <= bNum + sNum; i++) {
            if ((i <= bNum && (sNum + i) > bNum)
                    || (i >= bNum && (bNum + sNum) > i)) {
                answer++;
            }
        }

        return answer;
    }
}
