package level.lv0;

public class ContainingLetter {
    // 부분 문자열인지 확인하기
    public static void main(String[] args) {
        String my_string = "banana";
        String target = "wxyz";
        System.out.println(solution(my_string, target));
    }
    public static int solution(String my_string, String target) {
        int answer = my_string.contains(target) ? 1 : 0;
        return answer;
    }
}
