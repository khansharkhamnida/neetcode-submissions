class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for(int r=0; r<s.length();r++){
            while (set.contains(s.charAt(r))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(r));
            max = Math.max(max,r-left+1);
        }
        return max;
    }
}
