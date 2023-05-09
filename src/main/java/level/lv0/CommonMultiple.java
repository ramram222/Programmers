package level.lv0;

public class CommonMultiple {
    // 공배수
    public static void main(String[] args) {
        int number = 60;
        int n = 2;
        int m = 3;
        System.out.println(solution(number, n, m));
    }
    public static int solution(int number, int n, int m) {
        int answer = number % n == 0 && number % m == 0 ? 1 : 0;
        return answer;
    }
}
