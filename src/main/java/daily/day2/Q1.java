package daily.day2;

public class Q1 {
    // 두 수의 나눗셈
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 16;
        System.out.println(solution(num1, num2));
    }
    public static double solution(int num1, int num2) {
        int answer = 0;

        double dNum1 = num1;
        double dNum2 = num2;

        answer = (int) (dNum1 / dNum2 * 1000);

        return answer;
    }

}
