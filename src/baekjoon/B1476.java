package baekjoon;

import java.util.Scanner;

public class B1476 {
    public static void main(String[] args) {
        int Max = 15 * 28 * 19;

        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        int e = 1, s = 1, m = 1;
        for (int i = 1; i <= Max; i++) {
            if (E == e && S == s && M == m) {
                System.out.println(i);
                break;
            }
            e++;
            s++;
            m++;
            if (e == 16) {
                e = 1;
            }
            if (s == 29) {
                s = 1;
            }
            if (m == 20) {
                m = 1;
            }
        }
        sc.close();
    }
}
