import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int r = Integer.parseInt(stringTokenizer.nextToken());
            String s = stringTokenizer.nextToken();
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    bufferedWriter.write(s.charAt(j));
                }
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
