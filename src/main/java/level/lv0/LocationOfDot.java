package level.lv0;

public class LocationOfDot {
    // 점의 위치 구하기
    public static void main(String[] args) {
        int[] dot = {2, 4};
        System.out.println(solution(dot));
    }
    public static int solution(int[] dot) {
        if (dot[0] > 0) return (dot[1] > 0) ? 1 : 4;
        else return (dot[1] > 0) ? 2 : 3;
    }
}
