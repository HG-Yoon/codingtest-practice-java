import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        // 원본 배열을 복사하여 정렬할 배열 생성
        int[] sortedEmergency = emergency.clone();
        Arrays.sort(sortedEmergency);
        
        // 응급도를 기준으로 순위를 저장할 HashMap 생성
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sortedEmergency.length; i++) {
            rankMap.put(sortedEmergency[i], sortedEmergency.length - i);
        }
        
        // 원본 배열의 값을 순위로 변환
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = rankMap.get(emergency[i]);
        }
        return answer;
    }
}