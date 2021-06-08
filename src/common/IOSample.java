package common;

import java.io.*;

public class IOSample {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bf.readLine();
        bw.write("");

    }
}
