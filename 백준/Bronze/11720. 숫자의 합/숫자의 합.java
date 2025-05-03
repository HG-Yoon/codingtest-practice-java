import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(System.out));

        int n= Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer=new StringTokenizer(bufferedReader.readLine());
        String s= stringTokenizer.nextToken();
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
        }
        bufferedWriter.write(String.valueOf(sum));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
