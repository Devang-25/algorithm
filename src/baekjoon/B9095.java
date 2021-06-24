package baekjoon;

import java.util.Scanner;

public class B9095 {
    private static int go(int target){
        if(target == 0){
            return 1;
        }else if(target < 0){
            return 0;
        }
        int n =0;
        for(int i=1;i<=3;i++){
            n+=go(target-i);
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for(int i=0;i<c;i++){
            System.out.println(go(sc.nextInt()));
        }
        sc.close();
    }
}
