package level.lv0;

public class SumOfStringInt {
    // 문자열 정수의 합
    public static void main(String[] args) {
        String num_str = "123456789";
        System.out.println(solution(num_str));
    }
    public static int solution(String num_str) {
        int answer = 0;
        String[] arr = num_str.split("");
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}
