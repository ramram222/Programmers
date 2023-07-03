package daily.day21;

public class Q1 {
    // 숨어있는 숫자의 덧셈 (1)
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }

    public static int solution(String my_string) {
        int answer = 0;
        String tmpStr = my_string.replaceAll("[^0-9]", " ").trim();

        String[] arr = tmpStr.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (!arr[i].isEmpty()) {
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}
