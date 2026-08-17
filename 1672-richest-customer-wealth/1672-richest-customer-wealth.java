class Solution {
    public int maximumWealth(int[][] accounts) {
        int Maxwealth = 0;
        int rowSum = 0;
        for (int row = 0; row < accounts.length; row++) {
            rowSum = 0;
            for (int j = 0; j < accounts[row].length; j++) {
                rowSum = rowSum + accounts[row][j];
            }
            Maxwealth = Math.max(Maxwealth, rowSum);
        }
        return Maxwealth;
    }
}