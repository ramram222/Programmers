package daily.day19;

public class Q2 {
    public static void main(String[] args) {
        // 잘라서 배열로 저장하기
        String my_str = "abcdef123";
        int n = 3;
        System.out.println(solution(my_str, n));
    }

    public static String[] solution(String my_str, int n) {
        int length = my_str.length() % n == 0
                ? my_str.length() / n
                : my_str.length() / n + 1;
        String[] answer = new String[length];
        int startIdx = 0;
        int endIdx = n;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_str.substring(startIdx, endIdx);
            startIdx += n;
            endIdx = Math.min(endIdx + n, my_str.length());
        }
        return answer;
    }
}
