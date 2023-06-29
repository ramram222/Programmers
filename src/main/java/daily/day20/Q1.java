package daily.day20;

public class Q1 {
    public static void main(String[] args) {
        // 직사각형 넓이 구하기
        int[][] dots = {{-1, 1}, {1, 1}, {1, -1}, {-1, 1}};
        System.out.println(solution(dots));
    }
    public static int solution(int[][] dots) {
        int answer = 0;
        int width = dots[0][0];
        int length = dots[0][1];

        for (int i = 0; i < dots.length; i++) {
            if (width != dots[i][0]) {
                width = width - dots[i][0];
                break;
            }
        }
        for (int i = 0; i < dots.length; i++) {
            if (length != dots[i][1]) {
                length = length - dots[i][1];
                break;
            }
        }

        answer = width * length;

        return answer > 0 ? answer : answer * -1;
    }
}
