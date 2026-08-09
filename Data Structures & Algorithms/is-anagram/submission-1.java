class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        boolean allZero = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int j=0; j<t.length(); j++){
            char c = t.charAt(j);
            map.put(c,map.getOrDefault(c, 0) - 1);
        }

        for (int value : map.values()) {
            if (value != 0) {
                allZero = false;
                return false;
            }
        }
        return true;
    }
}
