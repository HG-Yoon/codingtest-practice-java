import java.io.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(bufferedReader.readLine());
        int lastPushed = -1;

        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            String cmd = stringTokenizer.nextToken();

            switch (cmd) {
                case "push":
                    int x = Integer.parseInt(stringTokenizer.nextToken());
                    queue.offer(x);
                    lastPushed = x;
                    break;
                case "pop":
                    bufferedWriter.write((queue.isEmpty() ? "-1" : String.valueOf(queue.poll())) + "\n");
                    break;
                case "size":
                    bufferedWriter.write(queue.size() + "\n");
                    break;
                case "empty":
                    bufferedWriter.write((queue.isEmpty() ? "1" : "0") + "\n");
                    break;
                case "front":
                    bufferedWriter.write((queue.isEmpty() ? "-1" : String.valueOf(queue.peek())) + "\n");
                    break;
                case "back":
                    bufferedWriter.write((queue.isEmpty() ? "-1" : String.valueOf(lastPushed)) + "\n");
                    break;
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
