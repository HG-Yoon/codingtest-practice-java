import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        StringBuilder sb1 = new StringBuilder(a);
        StringBuilder sb2 = new StringBuilder(b);
        String reversedAStr = sb1.reverse().toString();
        String reversedBStr = sb2.reverse().toString();
        int reversedA = Integer.parseInt(reversedAStr);
        int reversedB = Integer.parseInt(reversedBStr);
        bw.write(reversedA > reversedB ? reversedAStr : reversedBStr);
        bw.flush();
        bw.close();
        br.close();
    }
}
