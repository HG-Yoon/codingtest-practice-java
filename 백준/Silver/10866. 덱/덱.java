import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();

            switch (cmd) {
                case "push_front":
                    int x = Integer.parseInt(st.nextToken());
                    deque.addFirst(x);
                    break;
                case "push_back":
                    x = Integer.parseInt(st.nextToken());
                    deque.addLast(x);
                    break;
                case "pop_front":
                    bw.write((deque.isEmpty() ? "-1" : String.valueOf(deque.pollFirst())) + "\n");
                    break;
                case "pop_back":
                    bw.write((deque.isEmpty() ? "-1" : String.valueOf(deque.pollLast())) + "\n");
                    break;
                case "size":
                    bw.write(String.valueOf(deque.size()) + "\n");
                    break;
                case "empty":
                    bw.write((deque.isEmpty() ? "1" : "0") + "\n");
                    break;
                case "front":
                    bw.write((deque.isEmpty() ? "-1" : String.valueOf(deque.peekFirst())) + "\n");
                    break;
                case "back":
                    bw.write((deque.isEmpty() ? "-1" : String.valueOf(deque.peekLast())) + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
