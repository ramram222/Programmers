package daily.day10;

public class Q2 {
    // 2차원으로 만들기
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        System.out.println(solution(num_list, n));
    }
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int index = 0;

        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[index++];
            }
        }
        return answer;
    }
}
