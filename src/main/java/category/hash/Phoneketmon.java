package category.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Phoneketmon {
    // 폰켓몬
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 2};
        System.out.println(solution(nums));
    }
    public static int solution(int[] nums) {
        int answer = 0;
        Integer[] tmpNums = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        HashSet<Integer> hashSet = new HashSet<>(List.of(tmpNums));

        if (hashSet.size() <= (nums.length / 2)) {
            answer = hashSet.size();
        } else {
            answer = nums.length / 2;
        }

        return answer;
    }
}
