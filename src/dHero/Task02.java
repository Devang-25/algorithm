package dHero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Task02 {
    public static void main(String[] args) {
        String test = "admin  -wx 29 Sep 1983        833 source.h\nadmin  r-x 23 Jun 2003     854016 blockbuster.mpeg\nadmin  --x 02 Jul 1997        821 delete-this.py\nadmin  -w- 15 Feb 1971      23552 library.dll\nadmin  --x 15 May 1979  645922816 logs.zip\njane   --x 04 Dec 2010      93184 old-photos.rar\njane   -w- 08 Feb 1982  681574400 important.java\nadmin  rwx 26 Dec 1952   14680064 to-do-list.txt";
        solution(test);
    }

    public static String solution(String S) {
        String[] files = S.split("\\n");
        if(files.length == 0){
            return "NO FILES";
        }
        for (String file : files){
            String detail[] = file.split(" ");
            if(!detail[0].equals("admin")){
                continue;
            }
            detail = Arrays.stream(detail).filter(s->!s.equals("")&&!s.equals("admin")).toArray(size -> new String[size]);

            if(!detail[0].contains("x")){
                continue;
            }

            if(Integer.parseInt(detail[4])<14680064){
                return detail[1]+" "+detail[2]+" "+detail[3];
            }
        }
        return "NO FILES";
    }
}
