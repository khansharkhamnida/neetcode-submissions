class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int[] ans = new int[k];
        for(int j=0; j<k; j++){
            int maxFreq = 0;
            int maxKey = 0;
            for(int key : map.keySet()){
                if(map.get(key) > maxFreq){
                    maxFreq = map.get(key);
                    maxKey = key;
                }
            }
            ans[j] = maxKey;
            map.remove(maxKey);
        }
        return ans;
    }
}
