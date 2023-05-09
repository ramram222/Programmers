package level.lv0;

public class ReturnByFlag {
    // flag에 따라 다른 값 반환하기
    public static void main(String[] args) {
        int a = -4;
        int b = 7;
        boolean flag = false;
        System.out.println(solution(a, b, flag));
    }
    public static int solution(int a, int b, boolean flag) {
        int answer = flag ? a + b : a - b;
        return answer;
    }
}
