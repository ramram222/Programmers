package daily.day21;

public class Q4 {
    // 외계어 사전
    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(solution(spell, dic));
    }

    public static int solution(String[] spell, String[] dic) {
        int answer = 2;

        for (String d : dic) {
            int spellCnt = 0;
            for (String s : spell) {
                int cnt = 0;
                for (int i = 0; i < d.length(); i++) {
                    if (String.valueOf(d.charAt(i)).equals(s)) {
                        cnt++;
                    }
                }
                if (cnt == 1) spellCnt++;
            }
            if (spellCnt == spell.length) answer = 1;
        }
        return answer;
    }
}
