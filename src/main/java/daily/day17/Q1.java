package daily.day17;

public class Q1 {
    // 숫자 찾기
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        System.out.println(solution(num, k));

    }
    public static int solution(int num, int k) {
        int answer = String.valueOf(num).indexOf(String.valueOf(k));

        if (answer != -1) answer++;

        return answer;
    }
}
