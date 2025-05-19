import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int ans1 = b % 10 * a;
        int ans2 = b % 100 / 10 * a;
        int ans3 = b / 100 * a;
        int ans4 = a * b;
        bw.write(ans1 + "\n");
        bw.write(ans2 + "\n");
        bw.write(ans3 + "\n");
        bw.write(ans4 + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
