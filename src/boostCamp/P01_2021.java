package boostCamp;

import java.util.Map;
import java.util.TreeMap;

public class P01_2021 {
    public static void main(String[] args) {
        String[] test = {"/a/a_v2.x","/b/a.x"};
        solution(test);
    }

    public static String[] solution(String[] param0){
        TreeMap<String,Integer> map = new TreeMap<>();

        for(String param:param0){
            String[] str = param.split("/");
            String s = str[str.length-1].replaceAll("[_v0-9]","");
            map.put(s,map.getOrDefault(s,0)+1);
        }
        String[] answer = new String[map.size()*2];
        int i = 0;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            answer[i++] = entry.getKey();
            answer[i++] = String.valueOf(entry.getValue());
        }

        return null;
    }
}
