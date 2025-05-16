class Solution {
    public String solution(int age) {
        String answer = "";
        String ageStr = String.valueOf(age);
        char[] mapping = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        for (int i = 0; i < ageStr.toCharArray().length; i++) {
            int num = ageStr.charAt(i) - '0';
            answer += mapping[num];
        }
        return answer;
    }
}