package day1;

public class Q1 {
    // 두 수의 합
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        System.out.println(solution(num1, num2));
    }
    public static int solution(int num1, int num2) {
        int answer = -1;
        int min = -50000;
        int max = 50000;

        if(min <= num1 && num1 <= max && min <= num2 && num2 <= max) {
            answer = num1 + num2;
        }
        return answer;
    }
}
