package daily.day14;

public class Q1 {
    // 가까운 수
    public static void main(String[] args) {
        int[] array = {3, 10, 28};
        int n = 20;
        System.out.println(solution(array, n));
    }
    public static int solution(int[] array, int n) {
        int answer = 0;
        int min = 0;
        for(int num : array) {
            if(answer == 0){
                answer = num;
                min = Math.abs(num - n);
            } else {
                if(Math.abs(num - n) < min){
                    answer = num;
                    min = Math.abs(num - n);
                }else if( Math.abs(num - n) == min && num < answer){
                    answer = num;
                }
            }
        }
        return answer;
    }
}
