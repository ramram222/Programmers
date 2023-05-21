package daily.day13;

public class Q1 {
    // 컨트롤 제트
    public static void main(String[] args) {
        String s = "-1 -2 -3 Z";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        // Z가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻
        int answer = 0;
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) {
                answer -= Integer.parseInt(arr[i - 1]);
            } else {
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}
