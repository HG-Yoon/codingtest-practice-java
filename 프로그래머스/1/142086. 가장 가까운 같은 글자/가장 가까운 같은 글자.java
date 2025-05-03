import java.util.*;

class Solution {
    public int[] solution(String s) {
            int[] answer = new int[s.length()];
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!map.containsKey(c)) { // 문자를 처음 보는 경우
                    answer[i] = -1;
                    map.put(c, i); // 처음 나온 문자이므로, 지금 위치를 저장
                } else { // 문자를 이미 본 적 있는 경우
                    int lastIndex = map.get(c); // 이 문자가 마지막으로 나왔던 위치
                    answer[i] = i - lastIndex; // 현재 위치 - 마지막 위치
                    map.put(c, i); // 최신 위치로 갱신
                }
            }
            return answer;
    }
}