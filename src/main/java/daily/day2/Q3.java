package daily.day2;

import java.util.Arrays;

public class Q3 {
    // 분수의 덧셈
    // 복습 필요
    public static void main(String[] args) {
        int numer1 = 9;
        int denom1 = 2;
        int numer2 = 1;
        int denom2 = 3;

        System.out.println(Arrays.toString(solution(numer1, denom1, numer2, denom2)));

    }
    public static int GCD(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        return GCD(num2, num1 % num2);
    }

    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer;

        denum1 *= num2;
        denum2 *= num1;

        answer = new int[]{denum1 + denum2, num1 * num2};

        int greatest_common_divisor = GCD(answer[0], answer[1]);
        answer[0] /= greatest_common_divisor;
        answer[1] /= greatest_common_divisor;

        return answer;
    }

}
