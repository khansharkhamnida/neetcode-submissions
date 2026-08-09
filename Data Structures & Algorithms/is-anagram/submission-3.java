class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for(char y : t.toCharArray()){
            if(!map.containsKey(y)) return false;
            map.put(y, map.get(y) -1);
            if(map.get(y) < 0) return false;
        }
        for(int value : map.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
}
