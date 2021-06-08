package baekjoon;

import java.io.*;

public class B9613 {
    static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int index = Integer.parseInt(bf.readLine());
        for(int i= 0;i<index;i++){
            long sum = 0;
            String strArr[] =bf.readLine().split(" ");
            int n[] = new int[strArr.length];
            for(int j = 0;j< strArr.length;j++){
                n[j] = Integer.parseInt(strArr[j]);
            }

            for(int j = 1;j<strArr.length;j++){
                for(int z = j;z<strArr.length;z++){
                    if(j==z){
                        continue;
                    }
                    sum += gcd(n[j],n[z]);
                }
            }
            bw.write(sum + "\n");
        }
        bw.flush();
    }
}
