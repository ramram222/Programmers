package level.lv1;

public class EvenAndOdd {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(solution(num));
    }
    public static String solution(int num) {
        String answer = "";

        answer = num % 2 == 0 ? "Even" : "Odd";

        return answer;
    }
}
