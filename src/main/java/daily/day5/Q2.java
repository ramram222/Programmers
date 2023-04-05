package daily.day5;

public class Q2 {
    // 아이스 아메리카노
    public static void main(String[] args) {
        int money = 15000;
        System.out.println(solution(money));
    }
    public static int[] solution(int money) {
        int price = 5500;
        int num = money / price;
        int changes = money % price;

        int[] answer = {num, changes};

        return answer;
    }
}
