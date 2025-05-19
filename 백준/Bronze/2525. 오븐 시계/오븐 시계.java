import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        b += c;
        if (b > 59) {
            if (a == 23) {
                a = 0;
            } else {
                a = (a + (b / 60)) % 24;
            }
            b = b % 60;
        }
        bw.write(a + " " + b);
        bw.flush();
        bw.close();
        br.close();
    }
}