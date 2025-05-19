import java.util.*;

class Solution {
    public String solution(String letter) {
        // [실패 1] 초기에 morse를 Map처럼 쓰려 했으나, 자바 문법 오류 발생
        // → '.-':'a' 같은 구문은 파이썬식이고, 자바에선 에러난다!
        // → 결국 문제에서 제공한 문자열 배열을 직접 선언하고, Map으로 재구성해야 했다.

        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };

        // [교훈] 배열 인덱스 0~25 = 알파벳 'a'~'z' 와 1:1 대응된다는 사실을 활용!
        // → 해시맵을 만들어야 모스 → 알파벳 해석 가능
        Map<String, String> morseMap = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            char c = (char) ('a' + i);
            morseMap.put(morse[i], String.valueOf(c));
        }

        // [실패 2] letter.split(" "); 호출 후 결과를 변수에 저장하지 않음 → 의미 없는 호출
        // → 문자열 배열로 받아서 반복문에 활용해야 제대로 해석 가능
        String[] words = letter.split(" ");

        // [실패 3] StringBuilder 초기화 시 new StringBuilder(letter)로 잘못 시작함
        // → 원래 모스부호 원문이 아닌, 해석 결과를 쌓아야 하므로 new StringBuilder()가 맞다
        StringBuilder sb = new StringBuilder();

        // [실패 4] map.get(...) 호출 시 변수명이 map이라서 에러남 (정의된 건 morseMap)
        // → 이름 일관성 중요! 변수명 헷갈리지 않게 주의할 것
        for (int i = 0; i < words.length; i++) {
            sb.append(morseMap.get(words[i]));
        }

        // [성공] 최종 해석 결과 반환
        return sb.toString();
    }
}