package daily.day6;

import java.util.Scanner;

public class Q2 {
    // 직각삼각형 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
