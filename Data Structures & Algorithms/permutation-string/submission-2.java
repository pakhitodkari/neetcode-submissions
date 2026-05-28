class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }
        int[] freq = new int[26];
        char ch;
        int left = 0;
        for(int j=0;j<s1.length();j++){
            ch = s1.charAt(j);
            freq[ch - 'a']++;
        }
        for(int right=0;right<s2.length();right++){
            freq[s2.charAt(right)-'a']--;
            while(right-left+1 > s1.length())
            {
                freq[s2.charAt(left)-'a']++;
                left++;
            }
            if(allZero(freq)){
                return true;
            }
        }
        return false;
    }

    public boolean allZero(int[] freq){
        for(int n:freq){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}
