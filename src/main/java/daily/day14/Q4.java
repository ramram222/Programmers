package daily.day14;

public class Q4 {
    public static void main(String[] args) {
        // 대문자와 소문자
        String my_string = "cccCCC";
        System.out.println(solution(my_string));
    }
    public static String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
            } else {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}
