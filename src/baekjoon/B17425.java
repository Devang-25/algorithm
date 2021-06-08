package baekjoon;

import java.io.*;

public class B17425 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = 1000000;
        int[] sum = new int[m + 1];
        long[] s = new long[m+1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; i * j <= m; j++) {
                sum[i * j] += i;
            }
        }

        for(int i =1;i<=m;i++){
            s[i]=s[i-1]+sum[i];
        }


        int c = Integer.parseInt(bf.readLine());
        for(int i=0;i<c;i++) {
            int n = Integer.parseInt(bf.readLine());
            bw.write(s[n]+"\n");
        }
        bw.flush();
    }
}

