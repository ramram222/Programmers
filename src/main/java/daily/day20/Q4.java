package daily.day20;

public class Q4 {
    // 다항식 더하기
    public static void main(String[] args) {
        String polynomial = "x";
        System.out.println(solution(polynomial));
    }

    public static String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        int xNum = 0;
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("x")) {
                xNum++;
                System.out.println(xNum);
            } else if (arr[i].contains("x")) {
                xNum += Integer.parseInt(arr[i].replaceAll("x", ""));
            } else if (!arr[i].equals("+")) {
                num += Integer.parseInt(arr[i]);
            }
        }

        if (xNum == 0) {
            answer += num;
        } else if (xNum == 1) {
            answer += num == 0 ? "x" : "x + " + num;
        } else {
            answer += num == 0 ? xNum + "x" : xNum + "x + " + num;
        }

        return answer;
    }
}
