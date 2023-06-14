package daily.day19;

public class Q1 {
    // 7의 개수
    public static void main(String[] args) {
        int[] array = {7, 77, 17};
        System.out.println(solution(array));
    }
    public static int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            String num = Integer.toString(array[i]);
            String[] arr = num.split("");

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("7")) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
