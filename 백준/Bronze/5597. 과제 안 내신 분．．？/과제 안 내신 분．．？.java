import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] isSubmitted = new boolean[31]; // index 1~30 사용

        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            isSubmitted[n] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!isSubmitted[i]) {
                System.out.println(i); // BufferedWriter 대신 간단히 사용 가능
            }
        }
    }
}
