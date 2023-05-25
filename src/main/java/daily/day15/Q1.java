package daily.day15;

public class Q1 {
    // 영어가 싫어요
    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";
        System.out.println(solution(numbers));
    }
    public static long solution(String numbers) {
        long answer = 0;

//        HashMap<Integer, String> numMap = new HashMap<>();
//        numMap.put(0, "zero");
//        numMap.put(1, "one");
//        numMap.put(2, "two");
//        numMap.put(3, "three");
//        numMap.put(4, "four");
//        numMap.put(5, "five");
//        numMap.put(6, "six");
//        numMap.put(7, "seven");
//        numMap.put(8, "eight");
//        numMap.put(9, "nine");

        String[] numArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numArr.length; i++) {
            numbers = numbers.replaceAll(numArr[i], Integer.toString(i));
        }

        answer = Long.parseLong(numbers);

        return answer;
    }
}
