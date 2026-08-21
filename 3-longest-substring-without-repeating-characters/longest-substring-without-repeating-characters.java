class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l=0;
        int maxL=0;
        for(int r=0;r<s.length();r++)
        {
            // if we find a duplicate 
            while(set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
                l++;
            }
            // if duplicate nahi h add it into the set 
            set.add(s.charAt(r));
            maxL=Math.max(maxL,r-l+1);
        }
        return maxL;
    
    }
}