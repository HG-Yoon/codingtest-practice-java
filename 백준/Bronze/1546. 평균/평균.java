import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] a = new int[n];
        int max = 0, sum = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(stringTokenizer.nextToken());
            if (a[i] > max) {
                max = a[i];
            }
            sum += a[i];
        }
        double avg = sum * 100.0 / max / n;
        bufferedWriter.write(String.valueOf(avg));

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
