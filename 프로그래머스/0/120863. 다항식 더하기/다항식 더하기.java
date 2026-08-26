class Solution {
    public String solution(String polynomial) {
        int xCount = 0;
        int numCount = 0;

        String[] terms = polynomial.split(" ");

        for (String term : terms) {
            if (term.equals("+")) {
                continue;
            }

            if (term.contains("x")) {
                if (term.equals("x")) {
                    xCount += 1;
                } else {
                    xCount += Integer.parseInt(term.replace("x", ""));
                }
            } else {
                numCount += Integer.parseInt(term);
            }
        }

        StringBuilder sb = new StringBuilder();

        // 1차 항 처리
        if (xCount > 0) {
            if (xCount == 1) {
                sb.append("x");
            } else {
                sb.append(xCount).append("x");
            }
        }

        if (numCount > 0) {
            if (xCount > 0) {
                sb.append(" + ");
            }
            sb.append(numCount);
        }

        return sb.toString();
    }
}