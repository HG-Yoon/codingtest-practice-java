class Solution {
    public int solution(int num1, int num2) {
        int answer = (int) Math.floor((double) num1 / num2 * 1000);
        return answer;
    }
}