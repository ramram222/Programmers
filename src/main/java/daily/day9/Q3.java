package daily.day9;

import java.util.HashMap;

public class Q3 {
    // 가위 바위 보
    public static void main(String[] args) {
        String rsp = "205";
        System.out.println(solution(rsp));
    }
    public static String solution(String rsp) {
        String answer = "";

        String[] rspArr = rsp.split("");

        HashMap<String, String> win = new HashMap<>();
        win.put("2", "0");
        win.put("0", "5");
        win.put("5", "2");

        for (String s: rspArr) {
            answer += win.get(s);
        }

        return answer;
    }
}
