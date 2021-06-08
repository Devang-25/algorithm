package baekjoon;

import java.util.Scanner;

public class B4375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int prv = 0;
            for(int i = 1;;i++){
                prv = (prv*10+1)%a;
                if(prv == 0){
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }
}
