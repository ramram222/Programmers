package daily.day2;

public class Q2 {
    // 숫자 비교하기
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 10;

        System.out.println(solution(num1, num2));

    }
    public static int solution(int num1, int num2) {
        int answer = 0;

        answer = num1 == num2 ? 1 : -1;

        return answer;
    }

}
