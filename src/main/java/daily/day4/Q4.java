package daily.day4;

public class Q4 {
    public static void main(String[] args) {
        int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        System.out.println(solution(numbers));
    }
    public static double solution(int[] numbers) {
        double answer = 0;
        for (int num: numbers) {
            answer += num;
        }
        return answer / numbers.length;
        //return Arrays.stream(numbers).average().orElse(0);
    }
}
