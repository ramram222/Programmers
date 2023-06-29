package daily.day20;

public class Q2 {
    public static void main(String[] args) {
        // 캐릭터의 좌표
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};
        System.out.println(solution(keyinput, board));
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        int maxWidth = board[0] / 2;
        int maxLength = board[1] / 2;

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                x--;
            } else if (keyinput[i].equals("right")) {
                x++;
            } else if (keyinput[i].equals("up")) {
                y++;
            } else if (keyinput[i].equals("down")) {
                y--;
            }

            if (Math.abs(x) > maxWidth) {
                x = x > 0 ? x - 1 : x + 1;
            }

            if (Math.abs(y) > maxLength) {
                y = y > 0 ? y - 1 : y + 1;
            }
        }
        return new int[]{x, y};
    }
}
