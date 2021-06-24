package boostCamp;

public class P02_2021 {
    public static void main(String[] args) {
        String[] test = {"INT","INT","BOOL","SHORT","LONG"};
        solution(test);
    }

    private static int getBYte(String str){
        if(str.equals("BOOL")){
            return 1;
        }else if(str.equals("SHORT")){
            return 2;
        }else if(str.equals("FLOAT")){
            return 4;
        }else if(str.equals("INT")){
            return 8;
        }
        return 16;
    }

    public static String solution(String[] param0){
        StringBuilder sb= new StringBuilder();
        int len = 0,bC=0,l=0;
        boolean isBool = false;
        param0[0].equals()

        for(String param:param0){
            l = getBYte(param);
            if(l==1){
                isBool = true;
            }else{
                isBool = false;
            }
            if(l>8&&bC!=0){
                for(int i= bC;i<8;i++){
                    sb.append(".");
                }
                sb.append(",");
            }
            if(l==8){
                sb.append("########,");
            }else if(l==16){
                sb.append("########,########,");
            }else if(l==2){
                if(isBool){
                    sb.append(".##");
                    bC+=3;
                }else{
                    if(bC+l>=8){
                        for(int i= bC;i<8;i++){
                            sb.append(".");
                        }
                    }
                    sb.append("##");
                    bC+=3;
                }
                sb.delete(sb.length()-1,sb.length());
            }else if(l==4){

            }else{

            }
        }

    }

}
