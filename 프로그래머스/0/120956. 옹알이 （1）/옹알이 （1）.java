class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] speakable = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            for (String speak : speakable) {
                word = word.replace(speak, " ");
            }

            if (word.replace(" ", "").length() == 0) {
                answer++;
            }
        }

        return answer;
    }
}