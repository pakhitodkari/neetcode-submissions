class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for(int n:prices){
            if(n<min){
                min = n;
            }else{
                max = Math.max(max, n-min);
            }
        }
        return max;
    }
}
