package daily.day7;

public class Q1 {
    // 특정 문자 제거하기
    public static void main(String[] args) {
        String my_string = "BCBdbe";
        String letter = "B";
        System.out.println(solution(my_string, letter));
    }
    public static String solution(String my_string, String letter) {
        String answer = my_string.replace(letter, "");
        return answer;
    }
}
