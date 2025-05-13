class Solution {
    public int solution(int[] array) {
        int answer = 0; // 최빈값
        int[] index = new int[1000]; // 0 ~ 999까지 인덱스의 카운터
        int max = 0; // 최댓값 저장을 위한 변수

        for (int i = 0; i < array.length; i++) {
            index[array[i]]++; // 배열에 담긴 정수의 등장 횟수 카운트
        }

        // 최빈값 찾기
        for (int i = 0; i < index.length; i++) {
            if (max < index[i]) {
                max = index[i];
                answer = i;
            }
        }

        // 최빈값이 여러 개인지 확인
        int count = 0;
        for (int i = 0; i < index.length; i++) {
            if (index[i] == max) { // 최빈값의 등장 횟수와 같은 요소 찾기
                count++;
            }
        }

        return (count > 1) ? -1 : answer; // 최빈값이 여러 개면 -1 반환
    }
}