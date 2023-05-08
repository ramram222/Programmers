package level.lv0;

public class ToLowerCase {
    public static void main(String[] args) {
        // 소문자로 바꾸기
        String myString = "aBcDeFg";
        System.out.println(solution(myString));
    }
    public static String solution(String myString) {
        String answer = myString.toLowerCase();
        return answer;
    }
}
