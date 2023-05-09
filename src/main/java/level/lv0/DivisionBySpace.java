package level.lv0;

public class DivisionBySpace {
    // 공백으로 구분하기 1
    public static void main(String[] args) {
        String my_string = "i love you";
        System.out.println(solution(my_string));
    }
    public static String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }
}
