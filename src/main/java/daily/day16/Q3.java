package daily.day16;

public class Q3 {
    // 문자열 계산하기
    public static void main(String[] args) {
        String my_string = "3 + 4 - 4 - 3 - 5";
        System.out.println(solution(my_string));
    }
    public static int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length - 1; i++) {
            if (i % 2 == 0) continue;

            if (arr[i].equals("+")) {
                answer += Integer.parseInt(arr[i + 1]);
            } else if (arr[i].equals("-")) {
                answer -= Integer.parseInt(arr[i + 1]);
            }
        }
        return answer;
    }
}
