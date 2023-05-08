package level.lv0;

public class ToUpperCase {
    public static void main(String[] args) {
        // 대문자로 바꾸기
        String myString = "aBcDeFg";
        System.out.println(solution(myString));
    }
    public static String solution(String myString) {
        String answer = myString.toUpperCase();
        return answer;
    }
}
