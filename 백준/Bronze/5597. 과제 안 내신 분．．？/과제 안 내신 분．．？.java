import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] student = new int[30];
        for (int i = 0; i < 30; i++) {
            student[i] = i + 1;
        }
        int[] submit = new int[28];
        boolean[] isSubmitted = new boolean[31];
        for (int i = 0; i < 28; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            submit[i] = Integer.parseInt(st.nextToken());
            isSubmitted[submit[i]] = true;
        }
        for (int i = 1; i <= 30; i++) {
            if (!isSubmitted[i]) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
