package daily.day8;

public class Q2 {
    // 외계행성의 나이
    public static void main(String[] args) {
        int age = 23;
        System.out.println(solution(age));
    }
    public static String solution(int age) {
        String answer = "";
        String[] arr = Integer.toString(age).split("");

        for(int i=0; i<arr.length; i++){
            answer += (char)(Integer.parseInt(arr[i]) + 97);
        }

        return answer;
    }
}
