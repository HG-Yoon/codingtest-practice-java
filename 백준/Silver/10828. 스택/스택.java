import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String cmd = stringTokenizer.nextToken();
            switch (cmd) {
                case "push":
                    int x = Integer.parseInt(stringTokenizer.nextToken());
                    stack.push(x);
                    break;
                case "pop":
                    bufferedWriter.write((stack.isEmpty() ? "-1" : String.valueOf(stack.pop())) + "\n");
                    break;
                case "size":
                    bufferedWriter.write((String.valueOf(stack.size())) + "\n");
                    break;
                case "empty":
                    bufferedWriter.write((stack.isEmpty() ? "1" : "0") + "\n");
                    break;
                case "top":
                    bufferedWriter.write((stack.isEmpty() ? "-1" : String.valueOf(stack.peek())) + "\n");
                    break;
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
