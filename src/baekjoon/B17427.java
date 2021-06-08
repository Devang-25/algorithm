package baekjoon;

import java.util.Scanner;

public class B17427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long sum = 0;

        for (int i = 1; i <= a; i++) {
            sum += i * (a / i);
        }
        System.out.println(sum);
    }
}
