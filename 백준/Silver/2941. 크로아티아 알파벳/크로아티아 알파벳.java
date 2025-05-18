import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] croatian = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
        for (String pattern : croatian) {
            input = input.replace(pattern, "*");
        }
        bw.write(String.valueOf(input.length()));
        bw.flush();
        bw.close();
        br.close();
    }
}
