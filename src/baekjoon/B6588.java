package baekjoon;

import java.io.*;
import java.util.ArrayList;

public class B6588 {
    public static void main(String[] args) throws IOException {
        //체
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] isPrime = new boolean[1000001];

        for (int i = 2; i < 100000; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= 100000; i++) {
            if (isPrime[i] == false) {
                continue;
            }

            arr.add(i);
            for (int j = i * 2; j <= 100000; j += i) {
                isPrime[j] = false;
            }

        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                bw.flush();
                break;
            }

            for (Integer i : arr) {
                if (i >= n) {
                    bw.write("Goldbach's conjecture is wrong.\n");
                    break;
                }
                if (isPrime[n - i]) {
                    bw.write(n + " = " + i + " + " + (n - i) + "\n");
                    break;
                }
            }

        }

    }
}
