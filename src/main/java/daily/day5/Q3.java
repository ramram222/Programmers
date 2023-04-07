package daily.day5;

public class Q3 {
    // 나이 출력
    public static void main(String[] args) {
        int age = 23;
        System.out.println(solution(age));
    }
    public static int solution(int age) {
        int year = 2022;
        int answer = year - age + 1;

        return answer;
    }
}
