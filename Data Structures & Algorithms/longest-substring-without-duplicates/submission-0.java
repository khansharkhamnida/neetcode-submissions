class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a_pointer=0;
        int b_pointer=0;
        int max=0;
        HashSet<Character> characters = new HashSet();
        while(b_pointer<s.length()){
            if(!characters.contains(s.charAt(b_pointer))){
                characters.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(characters.size(),max);
            }else{
                characters.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }
}
