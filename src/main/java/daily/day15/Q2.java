package daily.day15;

public class Q2 {
    public static void main(String[] args) {
        // 인덱스 바꾸기
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        System.out.println(solution(my_string, num1, num2));
    }

    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) {
                answer += my_string.charAt(num2);
            } else if (i == num2) {
                answer += my_string.charAt(num1);
            } else {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
