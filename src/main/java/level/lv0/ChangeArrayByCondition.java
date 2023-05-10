package level.lv0;

public class ChangeArrayByCondition {
    // 조건에 맞게 수열 변환하기 3
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;
        System.out.println(solution(arr, k));
    }
    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < answer.length; i++) {
            if (k % 2 == 0) {
                answer[i] = arr[i] + k;
            } else {
                answer[i] = arr[i] * k;
            }
        }
        return answer;
    }
}
