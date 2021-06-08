package baekjoon;

import java.io.*;

public class B1978 {
    static boolean isPrime(int x){
        if(x<=1){
            return false;
        }else if(x == 2){
            return true;
        }
        for(int i=2;i*i<=x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine());
        String arr[]= br.readLine().split(" ");

        int sum = 0;
        for(String s : arr){
            if(isPrime(Integer.parseInt(s))){
                sum++;
            }
        }

        bw.write(sum+"");
        bw.flush();
    }
}
