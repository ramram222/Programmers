package daily.day3;

import java.util.Arrays;

public class Q3 {
    // 최빈값 구하기
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 5};
        System.out.println(solution(array));
    }
    public static int solution(int[] array) {
        int length = Arrays.stream(array).max().getAsInt() + 1;
        int answer = 0;
        int max = 0;
        int cnt = 0;

        int[] index = new int[length];

        for (int i = 0; i < array.length; i++) {
            index[array[i]]++;
        }

        for (int i = 0; i < index.length; i++) {
            if(max < index[i]) {
                max = index[i];
                answer = i;
            }
        }
        for (int i = 0; i < index.length; i++) {
            if (max == index[i]) {
                cnt++;
            }
        }
        if (cnt > 1) {
            answer = -1;
        }

        return answer;
    }

}
