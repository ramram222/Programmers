package level.lv1;

import java.util.Scanner;

public class SumOfDivisors {
    // 약수의 합
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        System.out.println(solution(num));

    }
    public static int solution(int n) {
        int answer = 0;
        int min = 0;
        int max = 3000;

        if(min <= n && n <= max) {
            for (int i = 1; i <= n; i++) {
                if(n % i == 0) {
                    answer += i;
                }
            }
        }

        return answer;
    }
}
