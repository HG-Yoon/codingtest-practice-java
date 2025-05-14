class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        if (Integer.parseInt(aStr + bStr) == (2 * a * b)) {
            answer = Integer.parseInt(aStr + bStr);
        } else {
            answer = Integer.parseInt(aStr + bStr) > (2 * a * b) ? Integer.parseInt(aStr + bStr) : 2 * a * b;
        }
        return answer;
    }
}