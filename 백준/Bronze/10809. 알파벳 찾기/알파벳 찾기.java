import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alpha = new int[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = -1;
        }
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // i는 현재 인덱스
            int idx = ch - 'a'; // 알파벳 위치 계산
            if (alpha[idx] == -1) {
                alpha[idx] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            bw.write(alpha[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
