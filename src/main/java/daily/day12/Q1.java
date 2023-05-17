package daily.day12;

public class Q1 {
    // 모음 제거
    public static void main(String[] args) {
        String my_string = "nice to meet you";
        System.out.println(solution(my_string));
    }
    public static String solution(String my_string) {
        String answer = "";
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (int i = 0; i < vowels.length; i++) {
            answer = my_string.replaceAll(vowels[i], "");
            my_string = answer;
        }
        return answer;
    }
}
