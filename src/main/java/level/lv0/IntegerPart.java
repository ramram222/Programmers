package level.lv0;

public class IntegerPart {
    // 정수 부분
    public static void main(String[] args) {
        double flo = 69.42;
        System.out.println(solution(flo));
    }
    public static int solution(double flo) {
        int answer = (int) flo;
        return answer;
    }
}
