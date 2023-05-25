package daily.day13;

public class Q3 {
    // 중복된 문자 제거
    public static void main(String[] args) {
        String my_string = "We are the world";
        System.out.println(solution(my_string));
    }
    public static String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.indexOf(my_string.charAt(i)) == i) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
