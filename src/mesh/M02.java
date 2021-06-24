package mesh;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {
    //offset 기준으로 index 값 변환
    private static int getIndex(int i, int offset, int size){
        return i-offset >= 0?i-offset:size+i-offset;
    }


    public static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {
        //a의 리스트 item 수
        int aL = a.size();
        List<Integer> indices = new ArrayList<>();
        int max = a.indexOf(Collections.max(a));

        for(int r:rotate){
            indices.add(getIndex(max, r%aL, aL));
        }

        return indices;
    }

}

public class M02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = IntStream.range(0, aCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int rotateCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> rotate = IntStream.range(0, rotateCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.getMaxElementIndexes(a, rotate);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

