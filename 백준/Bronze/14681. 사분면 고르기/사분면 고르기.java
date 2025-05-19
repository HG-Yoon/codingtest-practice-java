import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        if (x > 0 && y > 0) {
            bw.write("1");
        } else if (x < 0 && y > 0) {
            bw.write("2");
        } else if (x < 0 && y < 0) {
            bw.write("3");
        } else if (x > 0 && y < 0) {
            bw.write("4");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}