package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class B2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] man = new int[9];
        for(int i = 0;i<9;i++){
            man[i] = sc.nextInt();
        }
        int[] out = new int[2];
        loop:for(int a=0;a<9;a++){
            for(int b=0;b<9;b++){
                if(a==b){
                    continue;
                }
                int sum = 0;
                for(int i=0;i<9;i++){
                    if(i==a||i==b){
                        continue;
                    }
                    sum+=man[i];
                }
                if(sum == 100){
                    out[0] = a;
                    out[1] = b;
                    break loop;
                }
            }
        }

        ArrayList<Integer> arr= new ArrayList<>();
        for(int i =0;i<9;i++){
            if(i==out[0] || i==out[1]){
                continue;
            }
            arr.add(man[i]);
        }

        arr.sort(null);
        for(Integer a : arr){
            System.out.println(a);
        }
    }
}
