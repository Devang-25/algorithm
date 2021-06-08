package baekjoon;

import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int b1 = (b/100 * 100) *a, b3 = (b%100%10), b2 = (b%100 - b3) * a;
        b3 *= a;
        int sum = b1+b2+ b3;

        System.out.println(b3);
        System.out.println(b2/10);
        System.out.println(b1/100);
        System.out.println(sum);
    }
}
