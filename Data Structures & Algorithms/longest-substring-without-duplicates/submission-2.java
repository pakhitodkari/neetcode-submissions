class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        char c;
        int count = 0;
        int max = 0;
        for(int right=0;right<s.length();right++){
            c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
                count--;
            }
            set.add(c);
            count++;
            max = Math.max(max, count);
        }
        return max;
    }
}
