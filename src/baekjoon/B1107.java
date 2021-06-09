package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class B1107 {
    private static boolean[] brokenNum = new boolean[10];

    private static int possible(int x){
        int i = x;
        if(i==0){
            if(brokenNum[i]){
                return 0;
            }else{
                return 1;
            }
        }
        int len = 0;
        while (i>0){
            if(brokenNum[i%10]){
                return 0;
            }
            len++;
            i/=10;
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c= sc.nextInt();

        for(int i=0;i<c;i++){
            brokenNum[sc.nextInt()] = true;
        }

        //가능한 키조합 찾기
        int ans = 100>n? 100-n:n-100;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<1000000;i++){
            int len = possible(i);
            if(len> 0){
                int abs = n>=i?n-i:i-n;
                if(ans>len+abs){
                    ans =len+abs;
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
