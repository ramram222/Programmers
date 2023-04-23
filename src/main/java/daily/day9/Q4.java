package daily.day9;

public class Q4 {
    // 구슬을 나누는 경우의 수
    public static void main(String[] args) {
        int balls = 3;
        int share = 2;
        System.out.println(solution(balls, share));
    }
    public static int solution(int balls, int share) {
        return combination(balls, share);
    }
    public static int combination(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
    }
}
