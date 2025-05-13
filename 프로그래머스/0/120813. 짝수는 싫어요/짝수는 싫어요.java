class Solution {
    public int[] solution(int n) {
        int size = (n + 1) / 2; // n 이하의 홀수 개수
        int[] answer = new int[size];
        
        for (int i = 0, num = 1; num <= n; num += 2, i++) {
            answer[i] = num;
        }
        
        return answer;
    }
}