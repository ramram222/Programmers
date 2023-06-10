package daily.day17;

public class Q4 {
    public static void main(String[] args) {
        // OX퀴즈
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(solution(quiz));
    }

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < answer.length; i++) {
            String[] arr = quiz[i].split(" ");
            int tmpAnswer = arr[1].equals("+")
                    ? Integer.parseInt(arr[0]) + Integer.parseInt(arr[2])
                    : Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);

            answer[i] = tmpAnswer == Integer.parseInt(arr[4]) ? "O" : "X";
        }
        return answer;
    }
}
