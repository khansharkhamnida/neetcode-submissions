class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        int longest = 0;
        for(int num:nums){
            hashSet.add(num);
        }
        for(int num: nums){
            if(!hashSet.contains(num-1)){
                int length=0;
                while(hashSet.contains(num+length)){
                    length++;
                }
                longest=Math.max(longest,length);

            }
        }
        return longest;
    }
}
