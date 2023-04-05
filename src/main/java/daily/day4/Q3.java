package daily.day4;

public class Q3 {
    // 피자 나눠 먹기 (3)
    public static void main(String[] args) {
        int slice = 4;
        int n = 12;
        System.out.println(solution(slice, n));
    }
    public static int solution(int slice, int n) {

        int answer = slice >= n ? 1
                : n % slice == 0 ? n / slice
                : n / slice + 1;

        return answer;
    }
}
