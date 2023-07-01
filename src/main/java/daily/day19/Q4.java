package daily.day19;

public class Q4 {
    // 머쓱이보다 키 큰 사람
    public static void main(String[] args) {
        int[] array = {49, 180, 192, 170};
        int height = 167;
        System.out.println(solution(array, height));
    }
    public static int solution(int[] array, int height) {
        int answer = 0;
        for (int num: array) {
            if (num > height) answer++;
        }
        return answer;
    }
}
