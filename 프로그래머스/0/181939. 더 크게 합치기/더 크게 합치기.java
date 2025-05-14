class Solution {
    public int solution(int a, int b) {
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        if(Integer.parseInt(aStr + bStr) == Integer.parseInt(bStr + aStr)) {
            return Integer.parseInt(aStr + bStr);
        } else {
            return Integer.parseInt(aStr + bStr) > Integer.parseInt(bStr + aStr) ? Integer.parseInt(aStr + bStr) : Integer.parseInt(bStr + aStr);
        }
    }
}