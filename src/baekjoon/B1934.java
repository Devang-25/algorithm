package baekjoon;

import java.io.*;

public class B1934 {
    static int GCD(int a, int b){
        if(b==0){
            return a;
        }
        return GCD(b,a%b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine());

        for(int i=0;i<c;i++){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            bw.write((a*b)/GCD(a,b)+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
