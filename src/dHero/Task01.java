package dHero;

import java.util.HashMap;
import java.util.Locale;

public class Task01 {
    public static void main(String[] args) {
        System.out.println(solution("John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Penny Parker","Example"));
    }

    public static String solution(String S, String C) {
        String[] names = S.split(",");
        String c = C.toLowerCase();
        StringBuilder sb= new StringBuilder();
        StringBuilder nameSb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        int hasName=0;

        for(String name: names){
            nameSb = new StringBuilder();
            sb.append(name).append(" <");
            String[] str = name.split(" ");

            for(int i=1;i<=str.length;i++){
                String target = str[i-1].toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
                if(target.equals("")){
                    continue;
                }
                if(i==str.length){
                    if(target.length()>8){
                        sb.append(target.substring(0,8));
                        nameSb.append(target.substring(0,8));
                    }else{
                        sb.append(target);
                        nameSb.append(target);
                    }

                }else{
                    sb.append(target.substring(0,1));
                    nameSb.append(target.substring(0,1));
                }
            }
            String targetName = nameSb.toString();
            hasName = map.getOrDefault(targetName,1);
            if(hasName > 1){
                sb.append(hasName);
                map.put(targetName,hasName+1);
            }else{
                map.put(targetName,2);
            }
            sb.append("@").append(c).append(".com>,");
        }

        return sb.deleteCharAt(sb.length()-1).toString();
    }
}
