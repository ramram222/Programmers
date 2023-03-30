package daily.day1;

public class Q4 {
    // 몫 구하기
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 2;
        System.out.println(solution(num1, num2));
    }
    public static int solution(int num1, int num2) {
        int answer = 0;
        int min = 0;
        int max = 100;

        if(min <= num1 && num1 <= max && min <= num2 && num2 <= max) {
            answer = num1 / num2;
        }
        return answer;
    }
}
