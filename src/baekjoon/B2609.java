package baekjoon;

import java.io.*;

public class B2609 {
    static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String strinput[] = bf.readLine().split(" ");
        int a = Integer.parseInt(strinput[0]);
        int b = Integer.parseInt(strinput[1]);

        int g = gcd(a,b);
        long l = (a *b)/ g;
        bw.write(g + "\n" + l);
        bw.flush();

        bf.close();
        bw.close();
    }
}
