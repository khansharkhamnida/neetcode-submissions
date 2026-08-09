class Solution {
    public int characterReplacement(String s, int k) {
        int window_start=0;
        int res=0;
        int max_char_freq=0;
        int[] chars = new int[26];
        for(int window_end=0; window_end<s.length(); window_end++){
            chars[s.charAt(window_end)-'A']++;
            int character_count = chars[s.charAt(window_end)-'A'];
            max_char_freq=Math.max(character_count,max_char_freq);
            while(window_end-window_start+1-max_char_freq > k){
                chars[s.charAt(window_start)-'A']--;
                window_start++;
            }
            res=Math.max(res,window_end-window_start+1);
        }
        return res;
    }
}
