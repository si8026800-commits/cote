class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddStr = new StringBuilder();
        StringBuilder evenStr = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 != 0) {
                oddStr.append(num);
            } else {
                evenStr.append(num);
            }
        }

        int oddNum = Integer.parseInt(oddStr.toString());
        int evenNum = Integer.parseInt(evenStr.toString());

        return oddNum + evenNum;
    }
}