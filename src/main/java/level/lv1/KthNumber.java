package level.lv1;

import java.util.Arrays;

public class KthNumber {
    // K번째 수
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        System.out.println(solution(array, commands));

    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < answer.length; i++) {
                answer[i] = findNumber(array, commands[i][0], commands[i][1], commands[i][2]);
        }

        return answer;

    }
    private static int findNumber(int[] array, int i, int j, int k) {
        int num = 0;

        array = Arrays.copyOfRange(array, i - 1, j);
        Arrays.sort(array);

        num = array[k - 1];

        return num;
    }

}
