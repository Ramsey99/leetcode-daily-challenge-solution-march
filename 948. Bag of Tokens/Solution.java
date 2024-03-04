class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n = tokens.length;
        int score = 0, maxScore = 0, i = 0, j = n - 1;
        while (i <= j) {
            if (power >= tokens[i]) {
                power -= tokens[i];
                score++;
                maxScore = Math.max(maxScore, score);
                i++;
            } else if (score > 0 && power < tokens[j]) {
                power += tokens[j];
                score--;
                j--;
            } else {
                break;
            }
        }
        return maxScore; 
    }
}