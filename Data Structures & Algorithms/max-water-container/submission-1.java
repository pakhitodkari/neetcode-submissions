class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int width;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(i<j){
            min = Math.min(heights[i],heights[j]);
            width = j-i;
            max = Math.max(max, min*width);
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
