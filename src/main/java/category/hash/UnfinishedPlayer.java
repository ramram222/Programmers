package category.hash;

import java.util.HashSet;

public class UnfinishedPlayer {
    // 완주하지 못한 선수
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        System.out.println(solution(participant, completion));
    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashSet<String> hashSet = new HashSet<>();

        for (String s : completion) {
            hashSet.add(s);
        }

        // 중복 문제 해결하기
        for (String player : participant) {
            if (!hashSet.contains(player)) {
                answer = player;
            }
        }

        return answer;
    }
}
