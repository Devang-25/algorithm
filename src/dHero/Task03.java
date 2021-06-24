package dHero;

public class Task03 {
    public static void main(String[] args) {
        int []c=  {0,0,1,1,2};
        System.out.println(solution(2,3,c));
    }

    static int[] c= null;
    static int[][] map = null;
    private static int go(int u,int l,int i){
        if(u==0&&l==0){
            return 1;
        }else if(u==-1||l==-1){
            return 0;
        }else if(i==c.length){
            if(u==0&&l==0) {
                return 1;
            }
            return 0;
        }

        if(c[i]==2){
            map[0][i] = 1;
            map[1][i] = 1;
            return go(u-1,l-1,i+1);
        }else if(c[i]==0){
            return go(u,l,i+1);
        }else{
            map[0][i] = 1;
            if(go(u-1,l,i+1) == 1){
                return 1;
            }
            map[0][i] = 0;
            map[1][i] = 1;
            if(go(u,l-1,i+1) == 1){
                return 1;
            }
            map[1][i] = 0;
        }
        return 0;
    }

    public static String solution(int U, int L, int[] C) {
        c = C;
        map =new int[2][C.length];
        if(go(U,L,0)==0){
            return "IMPOSSIBLE";
        }
        StringBuilder sb = new StringBuilder();
        for(int[] arr: map){
            for(int i:arr){
                sb.append(i);
            }
            sb.append(",");
        }
        return sb.deleteCharAt(sb.length()-1).toString();
        // write your code in Java SE 8
    }
}
