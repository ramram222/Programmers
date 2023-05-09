package level.lv0;

public class DuplicationNumber {
    // 중복된 숫자 개수
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        System.out.println(solution(array, n));
    }
    public static int solution(int[] array, int n) {
        int answer = 0;
        for (int arr : array) {
            if (arr == n) {
                answer++;
            }
        }
        return answer;
    }
}
