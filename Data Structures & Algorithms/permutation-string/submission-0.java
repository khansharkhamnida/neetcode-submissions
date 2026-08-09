class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int window_start=0;
        int[] chars_for_s1 = new int[26];
        int[] chars_for_s2 = new int[26];
        if(s1.length()>s2.length()) return false;
        if(s1.length()==0) return true;
        for(int window_end=0; window_end<s1.length(); window_end++){
            chars_for_s1[s1.charAt(window_end)-'a']++;
            chars_for_s2[s2.charAt(window_end)-'a']++;
        }
        for(int window_end=s1.length();window_end<s2.length();window_end++){
            if(Arrays.equals(chars_for_s1, chars_for_s2)) return true;
            chars_for_s2[s2.charAt(window_start)-'a']--;
            chars_for_s2[s2.charAt(window_end)-'a']++;
            window_start++;
        }
        if(Arrays.equals(chars_for_s1, chars_for_s2)) return true;
        else return false;
    }
}
