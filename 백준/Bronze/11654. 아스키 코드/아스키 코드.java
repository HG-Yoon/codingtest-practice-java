import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(System.out));

        bufferedWriter.write(String.valueOf(bufferedReader.read()));

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
