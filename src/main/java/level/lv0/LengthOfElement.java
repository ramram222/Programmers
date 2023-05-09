package level.lv0;

public class LengthOfElement {
    // 배열 원소의 길이
    public static void main(String[] args) {
        String[] strList = {"We", "are", "the", "world!"};
        System.out.println(solution(strList));
    }
    public static int[] solution(String[] strList) {
        int[] answer = new int[strList.length];
        for (int i = 0; i < strList.length; i++) {
            answer[i] = strList[i].length();
        }
        return answer;
    }
}
