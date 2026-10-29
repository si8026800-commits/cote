import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stkList = new ArrayList<>();
        
        int i = 0;
        while (i < arr.length) {
            if (stkList.isEmpty()) {
                stkList.add(arr[i]);
                i++;
            } else {
                int lastIdx = stkList.size() - 1;
                if (stkList.get(lastIdx) == arr[i]) {
                    stkList.remove(lastIdx);
                    i++;
                } else {
                    stkList.add(arr[i]);
                    i++;
                }
            }
        }
        
        if (stkList.isEmpty()) {
            return new int[] { -1 };
        }
        
        int[] answer = new int[stkList.size()];
        for (int j = 0; j < stkList.size(); j++) {
            answer[j] = stkList.get(j);
        }
        
        return answer;
    }
}