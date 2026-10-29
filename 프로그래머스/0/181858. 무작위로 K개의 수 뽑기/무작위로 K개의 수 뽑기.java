import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (list.size() == k) {
                break;
            }
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}