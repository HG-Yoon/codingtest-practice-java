import java.util.*;

public class Solution {
        public int[] solution(int[] arr) {
            int[] answer = {};

            List<Integer> list = new ArrayList<Integer>();
            int prev = -1;
            for (int num : arr) {
                if (num != prev) {
                    list.add(num);
                    prev = num;
                }
            }

            answer = list.stream().mapToInt(i -> i).toArray();

            return answer;
        }
    }