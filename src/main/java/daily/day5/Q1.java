package daily.day5;

public class Q1 {
    // 옷가게 할인 받기
    public static void main(String[] args) {
        int price = 320000;
        System.out.println(solution(price));
    }
    public static int solution(int price) {
        int answer = (int) (price >= 500000 ? price * 0.8
                        : price >= 300000 ? price * 0.9
                        : price >= 100000 ? price * 0.95 : price);
        return answer;
    }
}
