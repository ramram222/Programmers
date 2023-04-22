package daily.day9;

import java.util.HashMap;

public class Q2 {
    // 모스 부호 (1)
    public static void main(String[] args) {
        String letter = ".--. -.-- - .... --- -.";
        System.out.println(solution(letter));
    }
    public static String solution(String letter) {
        String answer = "";

        String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f'," +
                "'--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l'," +
                "'--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r'," +
                "'...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x'," +
                "'-.--':'y','--..':'z'";
        morse = morse.replaceAll("'", "");
        morse = morse.replaceAll(",", ":");
        String[] arrMorse = morse.split(":");

        HashMap<String, String> morseMap = new HashMap<>();

        for (int i = 0; i < arrMorse.length; i+=2) {
            morseMap.put(arrMorse[i], arrMorse[i + 1]);
        }

        String[] arrLetter = letter.split(" ");

        for (String s: arrLetter) {
            answer += morseMap.get(s);
        }

        return answer;
    }
}
