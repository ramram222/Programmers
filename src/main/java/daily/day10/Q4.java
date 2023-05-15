package daily.day10;

public class Q4 {
    // 배열 회전시키기
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        String direction = "right";
        System.out.println(solution(numbers, direction));

    }
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < answer.length; i++) {
            if (direction.equals("right")) {
                if (i == 0) {
                    answer[i] = numbers[numbers.length - 1];
                } else {
                    answer[i] = numbers[i--];
                }
            }
            if (direction.equals("left")) {
                if (i == numbers.length - 1) {
                    answer[i] = numbers[0];
                } else {
                    answer[i] = numbers[i++];
                }
            }
        }
        return answer;
    }
}
