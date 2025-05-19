import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder(input);
        String answer = sb.append("??!").toString();
        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();
    }
}
