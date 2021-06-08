package baekjoon;

import java.util.Scanner;

public class B3085 {
    private static int n;
    private static int[][] map;

    private static int getCandyCount(int x,int y){
        int max = 1,tmp = 0;
        if(x!=n-1){
            tmp = map[y][x];
            map[y][x] = map[y][x+1];
            map[y][x+1] = tmp;
            tmp = getLineCount();
            if(tmp > max){
                max = tmp;
            }
            tmp = map[y][x];
            map[y][x] = map[y][x+1];
            map[y][x+1] = tmp;
        }
        if(y!=n-1){
            tmp = map[y][x];
            map[y][x] = map[y+1][x];
            map[y+1][x] = tmp;
            tmp = getLineCount();
            if(tmp > max){
                max = tmp;
            }
            tmp = map[y][x];
            map[y][x] = map[y+1][x];
            map[y+1][x] = tmp;
        }
        return max;
    }

    private static int getLineCount(){
        int a = 1,prv=0,tmp = 1;
        //축
        for(int i=0;i<n;i++){
            int xPrv = 0;
            int xTmp = 1;
            int yPrv = 0;
            int yTmp = 1;
            for(int j=0;j<n;j++){
                if(xPrv == map[i][j]){
                    xTmp++;
                }else{
                    xTmp = 1;
                    xPrv = map[i][j];
                }
                if(yPrv == map[j][i]){
                    yTmp++;
                }else{
                    yTmp = 1;
                    yPrv = map[j][i];
                }
                if(xTmp > a){
                    a = xTmp;
                }
                if(yTmp > a){
                    a = yTmp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] tmp = sc.nextLine().split("");
            for (int j = 0; j < n; j++) {
                if (tmp[j].equals("C")) {
                    map[i][j] = 1;
                } else if (tmp[j].equals("P")) {
                    map[i][j] = 2;
                } else if (tmp[j].equals("Z")) {
                    map[i][j] = 3;
                } else {
                    map[i][j] = 4;
                }
            }
        }

        int answer = 1;
        for(int y=0;y<n;y++){
            for(int x=0;x<n;x++){
                int calValue = getCandyCount(x,y);
                if(calValue > answer){
                    answer = calValue;
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
