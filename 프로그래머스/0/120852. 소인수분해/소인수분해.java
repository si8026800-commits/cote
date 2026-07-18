import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int i = 2;
        while (n > 1){
            if(n % i == 0){
                if(list.isEmpty() || list.get(list.size() - 1) != i){
                    list.add(i);
                }
                n /= i;
            } else {
                i++;
            }
        }
            int[] answer = new int[list.size()];
        for(int j = 0; j < list.size(); j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}