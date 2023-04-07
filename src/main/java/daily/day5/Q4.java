package daily.day5;

public class Q4 {
    // 배열 뒤집기
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(solution(num_list));
    }
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = num_list.length - 1; i >= 0; i--) {
            answer[num_list.length - i - 1] = num_list[i];
        }
        return answer;
    }
}
