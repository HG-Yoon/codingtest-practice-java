import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 읽기 위한 BufferedReader와 출력용 BufferedWriter 사용
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        // 알파벳 a~z (총 26개)의 첫 등장 위치를 저장할 배열
        int[] alpha = new int[26];

        // 모든 알파벳은 처음엔 등장하지 않았다고 가정하고 -1로 초기화
        for (int i = 0; i < 26; i++) {
            alpha[i] = -1;
        }

        // 문자열 입력 받기
        String s = reader.readLine();

        // 문자열의 각 문자를 순서대로 확인
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);        // 현재 문자를 꺼냄
            int idx = c - 'a';           // 해당 문자가 알파벳에서 몇 번째인지 계산 (a=0, b=1, ..., z=25)

            // 아직 alpha[idx]에 값이 없다면 (-1이라면), 이게 첫 등장!
            if (alpha[idx] == -1) {
                alpha[idx] = i;          // 현재 인덱스를 저장 (처음 등장한 위치)
            }
            // 이미 값이 있다면, 첫 등장은 이미 기록된 상태이므로 아무것도 하지 않음
        }

        // 최종적으로 alpha 배열 출력
        for (int i = 0; i < 26; i++) {
            writer.write(alpha[i] + " "); // a부터 z까지 순서대로, 각 알파벳의 첫 등장 위치를 출력
        }

        // 출력 마무리
        writer.flush();
        writer.close();
        reader.close();
    }
}
