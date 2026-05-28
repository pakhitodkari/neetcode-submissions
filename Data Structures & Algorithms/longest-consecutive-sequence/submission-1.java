class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0, max=0;
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        for(int s : set){
            if(set.contains(s) && !set.contains(s-1)){
                int n = s;
                count=1;
                while(set.contains(n+1)){
                    count++;
                    n++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
