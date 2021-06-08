package baekjoon;

import java.util.Scanner;

public class B1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            int tmp = sc.nextInt();
            min = Math.min(min, tmp);
            max = Math.max(max, tmp);
        }
        System.out.println(min * max);
    }
}
