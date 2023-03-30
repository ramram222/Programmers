package level.lv1;

import java.util.Arrays;

public class Average {
    //평균 구하기
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(solution(arr));
    }

    public static double solution(int[] arr) {
        double answer = 0;
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        answer = (double) sum / arr.length;
        return answer;
    }

}
