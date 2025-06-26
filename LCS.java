class LCS{
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1]; // match: move diagonally
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // no match: choose best of top/left
                }
            }
        }

        return dp[text1.length()][text2.length()];
    }
    public static void main(String[] args) {
        LCS solution = new LCS();
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println("Length of LCS: " + solution.longestCommonSubsequence(text1, text2)); // Output: 3
    }
}
